package controle_de_fluxo.condicionais;
import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        int nota = 7;
        int recuperacao = 2;


        /**
         *  if (nota >= 7) {
         *             System.out.println("Parabens, você foi aprovado!");
         *         } else if (nota >=4 && nota <7) {
         *             System.out.println("O aluno ficou de recuperção!");
         *             if(recuperacao >=  8) {
         *                 System.out.println("Aprovado com sucesso!");
         *             } else {
         *                 System.out.println("Reprovado com sucesso!");
         *             }
         *
         *         } else {
         *             System.out.println("Reprovado!");
         *         }
         */

        // OPERADORES TERNARIOS

        String resultado = nota > 7 ? "Aprovado" : nota >= 4 && nota <7 ? "Está de recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
