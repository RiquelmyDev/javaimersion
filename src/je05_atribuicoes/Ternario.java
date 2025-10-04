package je05_atribuicoes;
import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        double barca;
        double real;

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos titulos o barça tem? ");
        barca = sc.nextDouble();

        System.out.println("Quantos titulos o real? ");
        real = sc.nextDouble();

        String resultado = (barca >= real) ? "Sim" : "não";
        System.out.println("Barcelona tem mais titulos que o real? " + resultado );
    }
}
