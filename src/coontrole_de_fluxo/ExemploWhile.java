package coontrole_de_fluxo;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while(mesada > 0) {
            Double valorDoce = valorAleatorio();

            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("o doce de valor: " + valorDoce +
                    " Foi adicionado ao carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("mesada: " + mesada);
        System.out.println("Anya gastou todo o dinheiro da mesada.");

        /**
         * Nesse caso, oque acontece é que definimos que a contagem de carneiros
         * so pode ir ate 20, toda quez que achar esse limite, ele retorna a 0
         * e o nosso random, está definido em 5, mas vai de 0 a 4, fazendo comparações
         * ISSO significa, que a cada momento, ele faz uma comparação entre range, e carneiro
         * e quando o numero aleatorio do renge, bater com o de carneiros,
         * seria a hora qu ele toma uma pancada na cabeeça e dorme imediantamente
         * o!, faz dizer para o programa que quando eu encontrar essa condição
         * inves de ser true, vai definir como false, pq meu boolean esta true
         * quando ele acha ele em false, ele desativa o while
         */
        /**
         *         boolean acordado = true;
         *         int carneirinhos = 0;
         *         while(acordado){
         *             System.out.println("contando carneirinhos..." + (++carneirinhos));
         *             acordado = !(new Random().nextInt(21) == carneirinhos);
         *             if (carneirinhos == 20)
         *                     carneirinhos = 0;
         *         }
         *         System.out.println("Dormiu...");
         */
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
