package ColecoesParte2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Colecoes {

    public static void main(String[] args) {
        List<String> grupoMasculino = new ArrayList<>();
        List<String> grupoFeminino = new ArrayList<>();

        Set<Pessoa> pessoas = new HashSet<>();
        Pessoa pessoa1 = new Pessoa("Mario Junior", "Masculino");
        Pessoa pessoa2 = new Pessoa("Maria Silva", "Feminino");
        Pessoa pessoa3 = new Pessoa("João Mendes", "Masculino");
        Pessoa pessoa4 = new Pessoa("Ana Flavia", "Feminino");

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);

        for (Pessoa pessoa: pessoas) {
            if (pessoa.getSexo().equals("Masculino")) {
                grupoMasculino.add(pessoa.getNome());
            } else if (pessoa.getSexo().equals("Feminino")) {
                grupoFeminino.add(pessoa.getNome());
            }
        }

        System.out.println(grupoMasculino);
        System.out.println(grupoFeminino);
    }
}
