import java.util.Scanner;

public class MediaControle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1 = 5.3;
        double nota2 = 5.1;
        double nota3 = 5.5;
        double nota4 = 5.7;

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Em recuperação");
        } else if (media < 5){
            System.out.println("Reprovado");
        }
    }
}
