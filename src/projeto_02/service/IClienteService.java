package projeto_02.service;

import projeto_02.domain.Cliente;

import java.util.List;
import java.util.Optional;

public interface IClienteService {
    Cliente criarCliente(String nome, String cpf, String tel, String end, String numero, String cidade, String estado);
    Cliente atualizarCliente(Long id, String nome, String cpf, String tel, String end, String numero, String cidade, String estado);
    void deletarCliente(Long id);
    Cliente buscarClientePorId(Long id);
    List<Cliente> buscarTodosClientes();
}
