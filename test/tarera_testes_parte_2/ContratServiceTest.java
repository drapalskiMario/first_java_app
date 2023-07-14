package tarera_testes_parte_2;

import contrato.ContratoDAO;
import contrato.ContratoService;
import org.junit.Assert;
import org.junit.Test;
import tarera_testes_parte_2.mock.MockContratoDAO;

public class ContratServiceTest {

    private static final String MESSAGE_SUCCESS = "Sucesso em %s com mock";

    @Test
    public void salvarComSuccesso() {
        var contratoDAO = new MockContratoDAO();
        var contratoService = new ContratoService(contratoDAO);
        var result = contratoService.salvar();

        Assert.assertEquals(String.format(MESSAGE_SUCCESS, "salvar"), result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void erroAoSalvar() {
        var contratoDAO = new ContratoDAO();
        var contratoService = new ContratoService(contratoDAO);
        var result = contratoService.salvar();
    }

    @Test
    public void buscarComSuccesso() {
        var contratoDAO = new MockContratoDAO();
        var contratoService = new ContratoService(contratoDAO);
        var result = contratoService.buscar();

        Assert.assertEquals(String.format(MESSAGE_SUCCESS, "buscar"), result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void erroAoBuscar() {
        var contratoDAO = new ContratoDAO();
        var contratoService = new ContratoService(contratoDAO);
        var result = contratoService.buscar();
    }

    @Test
    public void atualizarComSuccesso() {
        var contratoDAO = new MockContratoDAO();
        var contratoService = new ContratoService(contratoDAO);
        var result = contratoService.atualizar();

        Assert.assertEquals(String.format(MESSAGE_SUCCESS, "atualizar"), result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void erroAoAtualizar() {
        var contratoDAO = new ContratoDAO();
        var contratoService = new ContratoService(contratoDAO);
        var result = contratoService.atualizar();
    }

    @Test
    public void deletarComSuccesso() {
        var contratoDAO = new MockContratoDAO();
        var contratoService = new ContratoService(contratoDAO);
        var result = contratoService.deletar();

        Assert.assertEquals(String.format(MESSAGE_SUCCESS, "deletar"), result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void erroAoDeletar() {
        var contratoDAO = new ContratoDAO();
        var contratoService = new ContratoService(contratoDAO);
        var result = contratoService.deletar();
    }


}
