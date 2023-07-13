package streams.op_terminais;

import streams.Pessoa;

public class AllMatch {

    public static void main(String[] args) {
        var pessoas = new Pessoa().popularPessoa();

        var allMatch = pessoas
                .stream()
                .allMatch(pessoa -> pessoa.getNacionalidade().equals("Brasil"));
        // verificar se todos da lista tem a condicao

        System.out.println(allMatch);

    }
}
