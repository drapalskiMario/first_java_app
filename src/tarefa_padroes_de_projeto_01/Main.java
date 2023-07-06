package tarefa_padroes_de_projeto_01;

public class Main {
    public static void main(String[] args) {
        // Criando uma fábrica de carros Tesla
        var teslaFactory = new TeslaFactory();
        var tesla = teslaFactory.criarCarro();
        tesla.exibirInfo();

        // Criando uma fábrica de carros Toyota
        var toyotaFactory = new ToyotaFactory();
        var toyota = toyotaFactory.criarCarro();
        toyota.exibirInfo();

        // Criando uma fábrica de carros Honda
        var hondaFactory = new HondaFactory();
        var honda = hondaFactory.criarCarro();
        honda.exibirInfo();
    }
}
