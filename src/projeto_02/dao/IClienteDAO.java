package projeto_02.dao;

import projeto_02.domain.Cliente;

import java.util.List;
import java.util.Optional;

public interface IClienteDAO {
    Cliente salvar(Cliente cliente);
    Cliente atualizar(Cliente cliente);
    void deletar(Long id);
    Cliente buscarPorId(Long id);
    List<Cliente> buscarTodos();
}
