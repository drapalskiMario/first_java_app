package tarefa_padroes_de_projeto_01;

class ToyotaFactory implements CarFactory {
    @Override
    public Car criarCarro() {
        return new Toyota();
    }
}
