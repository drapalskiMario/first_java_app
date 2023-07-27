package tarefa_banco_de_dados_2;

import org.junit.Assert;
import org.junit.Test;
import tarefa_banco_de_dados_2.dao.cliente.ClienteDAOImpl;
import tarefa_banco_de_dados_2.domain.Cliente;

public class ClienteTeste {

    @Test
    public void cadastrarTest() throws Exception {
        var dao = new ClienteDAOImpl();

        var cliente = new Cliente();
        cliente.setNome("Mario Junior");

        var id = dao.cadastrar(cliente);
        Assert.assertNotNull(id);

        var clienteBD = dao.obter(id);
        Assert.assertNotNull(clienteBD);
        Assert.assertNotNull(clienteBD.getId());
        Assert.assertEquals(cliente.getNome(), clienteBD.getNome());

        Integer qtdDel = dao.excluir(id);
        Assert.assertNotNull(qtdDel);
    }

    @Test
    public void atualizarTest() throws Exception {
        var dao = new ClienteDAOImpl();

        var cliente = new Cliente();
        cliente.setNome("Mario Junior");

        var id = dao.cadastrar(cliente);
        Assert.assertNotNull(id);

        var novoCliente = new Cliente();
        novoCliente.setNome("Nome Alterado");

        var clienteBD = dao.atualizar(id, novoCliente);
        Assert.assertNotNull(clienteBD);
        Assert.assertNotNull(clienteBD.getId());
        Assert.assertEquals(novoCliente.getNome(), clienteBD.getNome());

        Integer qtdDel = dao.excluir(id);
        Assert.assertNotNull(qtdDel);
    }


}
