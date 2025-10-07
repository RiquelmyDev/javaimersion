package coontrole_de_fluxo;

public class BreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <=5; numero ++){
            if(numero == 4)
                break;
            System.out.println(numero);
        }
        System.out.println("===================================");
        for (int num = 1; num <=5; num ++){
            if(num == 4)
                continue;
            System.out.println(num);
        }
    }
}
