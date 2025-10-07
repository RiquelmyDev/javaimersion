package controle_de_fluxo.condicionais;
import java.util.Scanner;



public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String plano;
        int input;


        System.out.println("------------------------------");
        System.out.println("Escolha seu plano favorito: ");
        System.out.println("Plano Bronze: " +
                "cotem ligações ilimitadas para todo Brasil!");
        System.out.println("Plano Silver: " +
                "cotem ligações ilimitadas para todo Brasil, 5GB de internet para usar como quiser! ");
        System.out.println("Plano Gold: " +
                "cotem ligações ilimitadas para todo Brasil, WhatsApp e Instagram, ilimitado e mais 10gB de internet para usar como quiser!");
        System.out.println("Plano Platinum+ : " +
                "cotem ligações ilimitadas para todo Brasil e America do sul, e internet ilimitada para usar como quiser!");
        System.out.println("------------------------------");

        System.out.println("Qual plano deseja assinar? " +
                "Bronze, Silver, Gold ou Platinum? ");
        plano = sc.nextLine();
        System.out.println("------------------------------");



        switch (plano){
            case "Bronze": {
                System.out.println("Muito bem, você acaba de assinar o plano Bronze!");
                break;
            }
            case "Silver": {
                System.out.println("Muito bem, você acaba de assinar o plano Silver!");
                break;
            }

            case "Gold": {
                System.out.println("Muito bem, você acaba de assinar o plano Gold!");
                break;
            }

            case "Platinum": {
                System.out.println("Muito bem, você acaba de assinar o plano Platinum!");
                System.out.println("Você tem acesso ao clube de pontos, deseja aderir esse beneficio?");
                input = sc.nextInt();

                if (input == 1) {
                    System.out.println("Parabéns, você é um cliente Exclusivo! ;)");
                } else{
                    System.out.println("Tudo bem, se caso tiver interesse entre em contato com o suporte!");
                }

                break;
            }
            default: {
                System.out.println("realize o inicio do programa novamente");
            }
        }

    }
}
