package tarera_testes_parte_2.mock;

import contrato.IContratoDAO;

public class MockContratoDAO implements IContratoDAO {
    private static final String MESSAGE_SUCCESS = "Sucesso em %s com mock";

    @Override
    public String salvar() {
        return String.format(MESSAGE_SUCCESS, "salvar");
    }

    @Override
    public String buscar() {
        return  String.format(MESSAGE_SUCCESS, "buscar");
    }

    @Override
    public String atualizar() {
        return  String.format(MESSAGE_SUCCESS, "atualizar");
    }

    @Override
    public String deletar() {
        return  String.format(MESSAGE_SUCCESS, "deletar");
    }
}
