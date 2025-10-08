package coontrole_de_fluxo;

import java.util.Random;

public class MetodoDoWhile {
    private static int numeroTentativas = 0;

    public static void main(String[] args) {
        System.out.println("Discando...");
        do {
            System.out.println("Tocando!!!");
        } while (tocando());

        if(numeroTentativas<5)
            System.out.println("Alooo!!!");
        else
            System.out.println("Chama encaminhada, para caixa postal.");
    }

    private static boolean tocando() {
        numeroTentativas++;
        boolean atendeu = new Random().nextInt(7)==1;
        if (numeroTentativas == 5) {
            return false;
        } else {
            return !atendeu;
        }
    }
}
