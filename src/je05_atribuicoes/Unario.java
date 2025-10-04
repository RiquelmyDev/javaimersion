package je05_atribuicoes;

public class Unario {
    public static void main(String[] args) {
        //classe Operadores.java

        int numero = +5; //ou somente 5

        //Imprimindo o numero negativo
        System.out.println(- numero);

        //incrementando numero em mais 1 numero, imprime 6

        numero ++;
        System.out.println(numero);

        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo
        System.out.println(numero);// agora sim, numero virou 7


        //ordem de precedência conta aqui
        boolean veradeira = false;
        boolean falsa = ! (1==1);
        System.out.println(falsa);


    }
}
