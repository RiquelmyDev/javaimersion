package metodos;

public class Metodos {

    public double somar (double a, double b) {
        return a + b;
    }

    public void print(String s) {
        String s = "Galo mineiro";
        System.out.println(s);
    }
    // throws Exception: indica que o metodo ao ser utilizado pode gerar uma eceção
    public double dividir(int dividendo, int divisor) throws Exception{

    }

    private void metodoPrivado(){}

    // alguns equivocos estruturais
    public void validar(){
        //esse metodo deveria retornar algum valor
        //no caso boolean
    }


}
