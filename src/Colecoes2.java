import java.util.ArrayList;
import java.util.List;

public class Colecoes2 {
    public static void main(String[] args) {
        String[] lista = {"Maria", "João", "Ana", "Carlos", "Duda"};
        String auxiliar = null;

        for (int i = 0; i < lista.length; i++ ) {
            for (int j = 0; j < (lista.length - 1); j++) {
                if(lista[j].compareTo(lista[j+1]) > 0) {
                    auxiliar = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = auxiliar;
                }
            }
        }

        System.out.println("\nLista em ordem alfabética");
        for(int i = 0; i < lista.length; i++ ) {
            System.out.println(lista[i]);
        }

        List<String> listaPessoas = new ArrayList<>();
        List<String> listaHomens = new ArrayList<>();
        List<String> listMulheres = new ArrayList<>();

        listaPessoas.add("Maria-F");
        listaPessoas.add("João-M");
        listaPessoas.add("Ana-F");
        listaPessoas.add("Carlos-M");
        listaPessoas.add("Duda-F");

        for (String pessoa : listaPessoas) {
            String[] valor = pessoa.split("-");
            if (valor[1].equals("F")) {
                listMulheres.add(valor[0]);
            } else if (valor[1].equals("M")){
                listaHomens.add(valor[0]);
            }
        }

        System.out.println("\nLista mulheres");
        for(String mulher: listMulheres) {
            System.out.println(mulher);
        }

        System.out.println("\nLista homens");
        for(String homem: listaHomens) {
            System.out.println(homem);
        }
    }
}
