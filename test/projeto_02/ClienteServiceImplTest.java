package projeto_02;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import projeto_02.dao.IClienteDAO;
import projeto_02.dao.impl.ClienteDAOImpl;
import projeto_02.domain.Cliente;
import projeto_02.service.IClienteService;
import projeto_02.service.impl.ClienteServiceImpl;

import java.util.List;

public class ClienteServiceImplTest {

    private IClienteDAO clienteDAO;
    private IClienteService clienteService;

    @Before
    public void setUp() {
        clienteDAO = new ClienteDAOImpl();
        clienteService = new ClienteServiceImpl(clienteDAO);
    }

    @Test
    public void criarCliente() {
        var cliente = clienteService.criarCliente("Mario", "12345678912", "41992349999", "centro", "123", "Curitiba", "PR");
        var clienteSalvo = clienteDAO.buscarPorId(1L);
        Assertions.assertEquals(cliente, clienteSalvo);
    }

    @Test
    public void atualizarCliente() {
        var cliente = clienteService.criarCliente("Mario", "12345678912", "41992349999", "centro", "123", "Curitiba", "PR");

        var clienteAtualizado = clienteService.atualizarCliente(1L, "Mario", "12345678912", "41992349999", "centro", "123", "São Paulo", "SP");
        var clienteModificado = clienteDAO.buscarPorId(1L);

        Assertions.assertEquals(clienteAtualizado, clienteModificado);
    }

    @Test
    public void deletarCliente() {
        var cliente = clienteService.criarCliente("Mario", "12345678912", "41992349999", "centro", "123", "Curitiba", "PR");

        clienteService.deletarCliente(1l);
        var clienteDeletado = clienteDAO.buscarPorId(1l);
        Assertions.assertNull(clienteDeletado);
    }

    @Test
    public void buscarClientePorId() {
        var cliente = clienteService.criarCliente("Mario", "12345678912", "41992349999", "centro", "123", "Curitiba", "PR");
        var clienteEncontrado = clienteService.buscarClientePorId(1L);
        Assertions.assertEquals(cliente, clienteEncontrado);
    }

    @Test
    public void buscarTodosClientes() {
        var cliente1 = clienteService.criarCliente("Mario", "12345678912", "41992349999", "centro", "123", "Curitiba", "PR");
        var cliente2 = clienteService.criarCliente("João", "12345678912", "41992349999", "centro", "123", "São Paulo", "SP");

        List<Cliente> clientes = clienteService.buscarTodosClientes();
        Assertions.assertEquals(2, clientes.size());
        Assertions.assertTrue(clientes.contains(cliente1));
        Assertions.assertTrue(clientes.contains(cliente2));
    }
}
