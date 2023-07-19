package projeto_02.service.impl;

import projeto_02.dao.IClienteDAO;
import projeto_02.domain.Cliente;
import projeto_02.exceptions.ClienteNãoEncontradoException;
import projeto_02.service.IClienteService;

import java.util.List;
import java.util.Optional;

public class ClienteServiceImpl implements IClienteService {

    private IClienteDAO clienteDAO;

    public ClienteServiceImpl(IClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    @Override
    public Cliente criarCliente(String nome, String cpf, String tel, String end, String numero, String cidade, String estado) {
        Long novoId = Long.valueOf(clienteDAO.buscarTodos().size() + 1);
        Cliente cliente = new Cliente(nome, cpf, tel, end, numero, cidade, estado);
        cliente.setId(novoId);
        return clienteDAO.salvar(cliente);
    }

    @Override
    public Cliente atualizarCliente(Long id, String nome, String cpf, String tel, String end, String numero, String cidade, String estado) {
        Cliente clienteExistente = clienteDAO.buscarPorId(id);
        if (clienteExistente != null) {
            Cliente clienteAtualizado = new Cliente(nome, cpf, tel, end, numero, cidade, estado);
            clienteAtualizado.setId(id);
            return clienteDAO.atualizar(clienteAtualizado);
        }
        return null;
    }

    @Override
    public void deletarCliente(Long id) {
        clienteDAO.deletar(id);
    }

    @Override
    public Cliente buscarClientePorId(Long id) {
        return clienteDAO.buscarPorId(id);
    }

    @Override
    public List<Cliente> buscarTodosClientes() {
        return clienteDAO.buscarTodos();
    }
}
