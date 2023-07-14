package contrato;

public class ContratoService {

    private final IContratoDAO contratoDAO;

    public ContratoService(IContratoDAO contratoDAO) {
        this.contratoDAO = contratoDAO;
    }

    public String salvar() {
        return contratoDAO.salvar();
    }

    public String buscar() {
        return contratoDAO.buscar();
    }

    public String atualizar() {
        return contratoDAO.atualizar();
    }

    public String deletar() {
        return contratoDAO.deletar();
    }
}
