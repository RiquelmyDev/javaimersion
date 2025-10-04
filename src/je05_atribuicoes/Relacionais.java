package je05_atribuicoes;

public class Relacionais {
    public static void main(String[] args) {
        int idadeIza = 18;
        boolean maiorIdade = idadeIza >= 18;
        System.out.println("Iza já é maior de idade? " + (maiorIdade ? "Sim, é" : "Ainda não."));








        //classe Operadores.java
        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2){
            System.out.println("Numero 1 maior que numero 2");
        }
        if(numero1 < numero2){
            System.out.println("Numero 1 menor que numero 2");
        }

        if(numero1 >= numero2){
            System.out.println("Numero 1 maior ou igual que numero 2");
        }

        if(numero1 <= numero2){
            System.out.println("Numero 1 menor ou igual que numero 2");
        }

        if(numero1 != numero2){
            System.out.println("Numero 1 é diferente de numero 2");
        }
    }
}
