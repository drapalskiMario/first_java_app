package tarefa_banco_de_dados_3.services;


import tarefa_banco_de_dados_3.domain.Cliente;
import tarefa_banco_de_dados_3.exceptions.DAOException;
import tarefa_banco_de_dados_3.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
