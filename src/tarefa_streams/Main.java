package tarefa_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        var pessoas = lerPessoas();
        var mulheres = pessoas
                .stream()
                .filter(p -> p.getSexo().equals("F"))
                .collect(Collectors.toList());

        System.out.println("*************");

        mulheres
                .stream()
                .forEach(System.out::println);
    }

    public static List<Pessoa> lerPessoas() {
        var pessoas = new ArrayList<Pessoa>();
        var scanner = new Scanner(System.in);

        System.out.println("Digite o número de pessoas:");
        int numeroPessoas = scanner.nextInt();

        for (int i = 0; i < numeroPessoas; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            String nome = scanner.next();

            System.out.println("Digite o sexo da pessoa " + (i + 1) + " (M/F):");
            String sexo = scanner.next();

            var pessoa = new Pessoa(nome, sexo);
            pessoas.add(pessoa);
        }

        return pessoas;
    }
}
