package streams.op_intermediarias;

import streams.Pessoa;

public class Filter {

    public static void main(String[] args) {
        var pessoas = new Pessoa().popularPessoa();

        var stream = pessoas
                .stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"));

        System.out.println(stream);

    }
}
