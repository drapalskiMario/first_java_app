package streams.op_intermediarias;

import streams.Pessoa;

import java.util.Comparator;

public class Sorted {

    public static void main(String[] args) {
        var pessoas = new Pessoa().popularPessoa();

        var stream = pessoas
                .stream()
                .sorted(Comparator.comparing(Pessoa::getIdade));

        System.out.println(stream);

    }
}
