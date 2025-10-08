package testetry_catch;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploTryCatch {
    public static void main(String[] args) {
        // no metodo, parse que vamos usar agora, ele avisa um possivel erro,
        // antes do codigo ser executado
        try {
            Number valor = NumberFormat.getInstance().parse("17,7");
            Double vd = valor.doubleValue();
            System.out.println(vd);
        } catch (ParseException ex) {
            System.err.println("Erro: " + ex.getMessage());
        }




        /**
         * No metodo, abaixo, o valueOf define o erro só apos o codigo ser execuutado
         *         try {
         *             Double valor = Double.valueOf("a.1");
         *             System.out.println(valor);
         *         }
         *         catch (NumberFormatException ex) {
         *             System.err.println("Formato invalido, você pode usar apenas números! ");
         *         }
         */
    }
}
