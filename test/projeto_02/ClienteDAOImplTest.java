package projeto_02;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import projeto_02.dao.IClienteDAO;
import projeto_02.dao.impl.ClienteDAOImpl;
import projeto_02.domain.Cliente;

import java.util.List;

public class ClienteDAOImplTest {

    private IClienteDAO clienteDAO;
    private Cliente cliente;

    @Before
    public void setUp() {
        clienteDAO = new ClienteDAOImpl();
        cliente = new Cliente("Mario", "12345678912", "41992349999", "centro", "123", "Curitiba", "PR");
        cliente.setId(Long.valueOf(1));
    }

    @Test
    public void salvarCliente() {
        clienteDAO.salvar(cliente);
        var clienteSalvo = clienteDAO.buscarPorId(1L);
        Assertions.assertEquals(cliente, clienteSalvo);
    }

    @Test
    public void atualizarCliente() {
        clienteDAO.salvar(cliente);

        var clienteAtualizado = new Cliente("Mario", "12345678912", "41992349999", "centro", "123", "São Paulo", "SP");
        clienteDAO.atualizar(clienteAtualizado);

        var clienteModificado = clienteDAO.buscarPorId(1L);
        Assertions.assertEquals(clienteAtualizado, clienteModificado);
    }

    @Test
    public void deletarCliente() {
        clienteDAO.salvar(cliente);

        clienteDAO.deletar(1L);
        var clienteDeletado = clienteDAO.buscarPorId(1L);
        Assertions.assertNull(clienteDeletado);
    }

    @Test
    public void buscarTodosClientes() {
        var cliente1 = cliente;
        var cliente2 = new Cliente("João", "12345678912", "41999999999", "centro", "123", "Rio de Janeiro", "RJ");
        clienteDAO.salvar(cliente1);
        clienteDAO.salvar(cliente2);

        List<Cliente> clientes = clienteDAO.buscarTodos();
        Assertions.assertEquals(2, clientes.size());
        Assertions.assertTrue(clientes.contains(cliente1));
        Assertions.assertTrue(clientes.contains(cliente2));
    }
}
