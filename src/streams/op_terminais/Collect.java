package streams.op_terminais;

import streams.Pessoa;

import java.util.stream.Collectors;

public class Collect {

    //convert streamns para list, set, map
    public static void main(String[] args) {
        var pessoas = new Pessoa().popularPessoa();

        var brasileiros = pessoas
                .stream()
                .filter(p -> p.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toList());


        var brasileirosMapeados = pessoas
                .stream()
                .filter(p -> p.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toMap(Pessoa::getIdade, Pessoa::new));

        System.out.println(brasileiros);
        System.out.println(brasileirosMapeados);

    }
}
