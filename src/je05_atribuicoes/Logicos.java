package je05_atribuicoes;

public class Logicos {
    public static void main(String[] args) {
        boolean r1 = true;
        boolean r2 = false;

        // aqui irei usar o operador logico E &&, para unir as duas expressões

        // nese caso, ambos devem ter resultado igual
        if(r1 && r2)
            System.out.println("Os dois valores precisam ser verdadeiros");

        // se condição 1 e 2 for ve

        // nesse caso, se apenas um atender o desejo,  o codigo é executado
        if(r1 || r2)
            System.out.println("Um dos valores precisam ser verdadeiros");


        if((34 == 34 && r1!=r2 || 4>3))
            System.out.println("Se executou, é por  que é veradeiro");



        int numero1 = 1;
        int numero2 = 1;

        // AQUI O & NÃO COMPARA SE É IGUAL, ELE FAZ UMA JUNÇÃO DA LOGICA, ELE COM UM SO, VERIFICA AS DUAS OCORRENCIAS, IDEPENDENTE DA PRIMEIRA SER FALSE
        if(numero1 ++ == 2 && numero2 ++ == 2 )
            System.out.println("As 2 condições são verdadeiras");
        System.out.println("O numero 1 agora é " + numero1);
        System.out.println("O numero 2 agora é " + numero2);
    }
}
