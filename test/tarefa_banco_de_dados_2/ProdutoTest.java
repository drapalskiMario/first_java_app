package tarefa_banco_de_dados_2;

import org.junit.Assert;
import org.junit.Test;
import tarefa_banco_de_dados_2.dao.cliente.ClienteDAOImpl;
import tarefa_banco_de_dados_2.dao.produto.ProdutoDAOImpl;
import tarefa_banco_de_dados_2.domain.Cliente;
import tarefa_banco_de_dados_2.domain.Produto;

import java.math.BigDecimal;

public class ProdutoTest {

    @Test
    public void cadastrarTest() throws Exception {
        var dao = new ProdutoDAOImpl();

        var produto = new Produto();
        produto.setNome("Produto exemplo");
        produto.setPreco(BigDecimal.valueOf(10.99));
        produto.setQuantidade(Long.valueOf(1));

        var id = dao.cadastrar(produto);
        Assert.assertNotNull(id);

        var produtoBD = dao.obter(id);
        Assert.assertNotNull(produtoBD);
        Assert.assertNotNull(produtoBD.getId());
        Assert.assertEquals(produto.getNome(), produtoBD.getNome());
        Assert.assertEquals(produto.getPreco(), produtoBD.getPreco());
        Assert.assertEquals(produto.getQuantidade(), produtoBD.getQuantidade());

        Integer qtdDel = dao.excluir(id);
        Assert.assertNotNull(qtdDel);
    }

    @Test
    public void atualizarTest() throws Exception {
        var dao = new ProdutoDAOImpl();

        var produto = new Produto();
        produto.setNome("Produto exemplo");
        produto.setPreco(BigDecimal.valueOf(10.99));
        produto.setQuantidade(Long.valueOf(1));

        var id = dao.cadastrar(produto);
        Assert.assertNotNull(id);

        var produtoAlterado = new Produto();
        produtoAlterado.setNome("Produto alterado");
        produtoAlterado.setPreco(BigDecimal.valueOf(25.99));
        produtoAlterado.setQuantidade(Long.valueOf(5));

        dao.atualizar(id, produtoAlterado);

        var produtoBD = dao.obter(id);
        Assert.assertNotNull(produtoBD);
        Assert.assertNotNull(produtoBD.getId());
        Assert.assertEquals(produtoAlterado.getNome(), produtoBD.getNome());
        Assert.assertEquals(produtoAlterado.getPreco(), produtoBD.getPreco());
        Assert.assertEquals(produtoAlterado.getQuantidade(), produtoBD.getQuantidade());

        Integer qtdDel = dao.excluir(id);
        Assert.assertNotNull(qtdDel);
    }
}
