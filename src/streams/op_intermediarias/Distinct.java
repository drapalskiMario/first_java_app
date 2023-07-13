package streams.op_intermediarias;

import streams.Pessoa;

import java.util.Comparator;

public class Distinct {

    public static void main(String[] args) {
        var pessoas = new Pessoa().popularPessoa();

        var stream = pessoas
                .stream()
                .distinct(); //baseado no equals e hashcode - remove os iguais

        System.out.println(stream);

    }
}
