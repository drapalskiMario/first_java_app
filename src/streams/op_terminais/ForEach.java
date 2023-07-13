package streams.op_terminais;

import streams.Pessoa;

public class ForEach {

    public static void main(String[] args) {
        var pessoas = new Pessoa().popularPessoa();

        pessoas
                .stream()
                .forEach(pessoa -> System.out.println(pessoa.getNome()));


        pessoas
                .stream()
                .map(Pessoa::getIdade)
                .forEach(idade -> System.out.println(idade));

    }
}
