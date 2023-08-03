package tarefa_banco_de_dados_3.services.impl;

import tarefa_banco_de_dados_3.dao.IProdutoDAO;
import tarefa_banco_de_dados_3.dao.generic.IGenericDAO;
import tarefa_banco_de_dados_3.domain.Produto;
import tarefa_banco_de_dados_3.services.IProdutoService;
import tarefa_banco_de_dados_3.services.generic.impl.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super((IGenericDAO<Produto, String>) dao);
	}

}
