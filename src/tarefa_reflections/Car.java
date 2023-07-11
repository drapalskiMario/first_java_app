package tarefa_reflections;

@Tabela(nome = "car")
public class Car {

    public static void main(String[] args) throws NoSuchMethodException {
        var classe = Car.class;

        // Obtém a anotação "tabela"
        var tabelaAnnotation = classe.getAnnotation(Tabela.class);

        // Obtém o valor da propriedade "nome"
        var nomeTabela = tabelaAnnotation.nome();

        System.out.println("Nome da tabela: " + nomeTabela);
    }
}
