package tiposwrapeers;

public class TiposWrapeers {
    public static void main(String[] args) {


        // conversão explicita
        //double numeroDouble = 123.22;
        //int  numeroInt = (int) numeroDouble;
        //System.out.println(numeroInt);

        // conversão do tipo implicita
        ///double d = 100.0;
        ///int i = (int) d;
        ///System.out.println(i);

        /// agora os codigos, mas vou estar utilizando os metodos

        Double d = 100.0;
        Integer i = d.intValue();
        System.out.println(i);

        // Aqui eu retorno um tipo primitivo do tipo double, nesse caso e melhor para operações
        String galo = "555.11";
        double zi = Double.parseDouble(galo);
        System.out.println(zi);


        /// aqui, eu faço integer me retornar um objeto Integer, uma classe wraper . se for esse caso, tenho varios metodos complementares com ele
        String clube = "100";
        int c = Integer.valueOf(clube);
        System.out.println(c);

        // valuOf() pode receber mais de um parametro, ele te, sobrecarga.
        // objeto interValue() e usado para converter Integer para inteiro

        // comparação de objetos

        String galo2 = "555";
        String galo3 = "557";

        Integer obj1 = Integer.parseInt(galo2);
        Integer obj2 = Integer.parseInt(galo3);

        System.out.println(obj1.equals(obj2)); // retorna true se for igual

        System.out.println(obj1.compareTo(obj2)); // se for 0, são iguais -1 menor, 1 maior
    }

}
