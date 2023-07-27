package tarefa_banco_de_dados_2.dao.produto;

import tarefa_banco_de_dados_2.domain.Produto;

public interface IProdutoDAO {

    public Long cadastrar(Produto produto) throws Exception;

    public Produto obter(Long id) throws Exception;

    public Produto atualizar(Long id, Produto novoProduto) throws Exception;

    public Integer excluir(Long id) throws Exception;
}
