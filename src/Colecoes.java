import java.util.ArrayList;
import java.util.List;

public class Colecoes {

    public static void main(String[] args) {
        List<String> grupoMasculino = new ArrayList<>();
        List<String> grupoFeminino = new ArrayList<>();

        String nome = "Maria Silva";
        String sexo = "Feminino";

        if (sexo.equals("Masculino")) {
            grupoMasculino.add(nome);
        } else if (sexo.equals("Feminino")) {
            grupoFeminino.add(nome);
        }

        System.out.println(grupoMasculino);
        System.out.println(grupoFeminino);
    }
}
