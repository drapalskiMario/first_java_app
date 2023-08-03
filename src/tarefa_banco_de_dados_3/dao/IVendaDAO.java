package tarefa_banco_de_dados_3.dao;

import tarefa_banco_de_dados_3.dao.generic.IGenericDAO;
import tarefa_banco_de_dados_3.domain.Venda;
import tarefa_banco_de_dados_3.exceptions.DAOException;
import tarefa_banco_de_dados_3.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
