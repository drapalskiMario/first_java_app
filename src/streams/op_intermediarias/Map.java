package streams.op_intermediarias;

import streams.Pessoa;

public class Map {

    public static void main(String[] args) {
        var pessoas = new Pessoa().popularPessoa();

        var stream = pessoas
                .stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .map(Pessoa::getIdade);

        System.out.println(stream);

    }
}
