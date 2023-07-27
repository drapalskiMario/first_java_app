package tarefa_banco_de_dados_2.dao.cliente;

import tarefa_banco_de_dados_2.domain.Cliente;

public interface IClienteDAO {

    public Long cadastrar(Cliente cliente) throws Exception;

    public Cliente obter(Long id) throws Exception;

    public Cliente atualizar(Long id, Cliente novoCliente) throws Exception;

    public Integer excluir(Long id) throws Exception;
}
