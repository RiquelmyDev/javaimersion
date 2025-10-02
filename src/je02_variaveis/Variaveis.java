package je02_variaveis;

public class Variaveis {
    public static void main(String[] args) {

        // pelas boas praticas de programação, quando o nome da variavel
        // está em maiusculo, ela é imutavel, mas isso é so na boa pratica
        // se eu quiser mudar, eu posso.
        String BR = "Brasil";
        double PI = 3.14;
        int ESTADOS_BRASILEIROS = 27;
        int ANO_2000 = 2000;
        // ex
        BR = "Argentina";

        System.out.println(BR);
        ///  viu? Para realmente declarar para nosso sistema que é imutavel, devemos
        final String MAIOR_CLUBE = "Atletico Mineiro";
        ///  agora sim, pelas boas prATICAS,e pelo nosso sistema, ela é imutavel


    }
}
