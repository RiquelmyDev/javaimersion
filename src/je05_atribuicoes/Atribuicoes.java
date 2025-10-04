package je05_atribuicoes;
import java.util.Date;

public class Atribuicoes {
    public static void main(String[] args) {
        // tipos de atribuição

        String testee = "Barcelona";
        String name = "riquelmy" + "vasconcelos"; // tambem pode fazer atribuição
        // por ser um valor literal de uma string, tambem podemos usar metodo de string
        String team = "Futebol Club ".concat(testee);
        System.out.println(team);


        int n = 1;
        double x = 2.22;
        char letra = 'A';
        boolean teste = true;
        Date dateBorn = new Date();

    }
}
