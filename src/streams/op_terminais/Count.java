package streams.op_terminais;

import streams.Pessoa;

public class Count {

    public static void main(String[] args) {
        var pessoas = new Pessoa().popularPessoa();

        var count = pessoas
                .stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .count();

        System.out.println(count);

    }
}
