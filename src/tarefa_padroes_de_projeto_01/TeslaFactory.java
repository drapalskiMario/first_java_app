package tarefa_padroes_de_projeto_01;

class TeslaFactory implements CarFactory {
    @Override
    public Car criarCarro() {
        return new Tesla();
    }
}
