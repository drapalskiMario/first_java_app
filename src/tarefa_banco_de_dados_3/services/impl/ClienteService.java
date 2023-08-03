package tarefa_banco_de_dados_3.services.impl;

import tarefa_banco_de_dados_3.dao.IClienteDAO;
import tarefa_banco_de_dados_3.domain.Cliente;
import tarefa_banco_de_dados_3.exceptions.DAOException;
import tarefa_banco_de_dados_3.exceptions.MaisDeUmRegistroException;
import tarefa_banco_de_dados_3.exceptions.TableException;
import tarefa_banco_de_dados_3.services.IClienteService;
import tarefa_banco_de_dados_3.services.generic.impl.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	//private IClienteDAO clienteDAO;
	
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		//this.clienteDAO = clienteDAO;
	}

//	@Override
//	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
//		return clienteDAO.cadastrar(cliente);
//	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

//	@Override
//	public void excluir(Long cpf) {
//		clienteDAO.excluir(cpf);
//	}
//
//	@Override
//	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException{
//		clienteDAO.alterar(cliente);
//	}

}
