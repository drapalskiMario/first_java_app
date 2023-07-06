package tarefa_padroes_de_projeto_01;

class HondaFactory implements CarFactory {
    @Override
    public Car criarCarro() {
        return new Honda();
    }
}
