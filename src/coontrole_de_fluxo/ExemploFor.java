package coontrole_de_fluxo;
import java.util.Random;


public class ExemploFor {
    public static void main(String[] args) {
        int contador = 30;
        boolean dormiu = false;
        for( int carneiro = 1; carneiro <=20; carneiro ++) {
            System.out.println(carneiro + " - Carneiros");
            if(dormiu = new Random().nextInt(20) == carneiro){
                System.out.println("pegou no son....");
                break;
            }
        }



        for( int carneiro = 1; carneiro <=20; carneiro ++) {
            System.out.println(carneiro + " Carneiros");
        }

        /**
         *         for( int carneiro = 1; carneiro <=20; carneiro ++) {
         *             System.out.println(carneiro + " Carneiros");
         *         }
         */

        for( ; contador >= 1 ;){
            System.out.println("Contagem regressiva para o lançamento! " + contador);
            contador --;
            if (contador == 0 ){
                System.out.println("lançamento finalizado com sucesso!");
            }

        }

        //-------------------------------
        // usando for em arrays


        /**
         * O uso do for / each está fortemente relacionado, com um cenário onde contenha um
         * array ou coleção, e assim, a interação é baseada nos elementos da coleção
         */

        String alunos[]= {"kenndy", "fabio", "Riquelmy", "mauricio", "jonatas", "huziel"};
        for (String aluno : alunos){
            System.out.println(aluno);
        }


        // usando agora o for para recuperar o indice dos alunos
        // aqui falo que x=0, e pra cada x, representa um indice de aluno, como o indice vai de 0 ate 4, equanto o indice nao che
        // chegar a 0, ele não encerra. no caso vai seria 0 < 3
        for (int x=0; x < alunos.length; x++){
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

        /// agora usando Random, que sorteia um numero aleatorio para
        // acionar uma condição


    }
}
