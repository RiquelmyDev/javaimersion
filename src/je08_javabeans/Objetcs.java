package je08_javabeans;

public class Objetcs {
    public static void main(String[] args) {
        Aluno riquelmy = new Aluno();
        riquelmy.setName("Riquelmy");
        riquelmy.setMatricula(11);

        System.out.println(" O nome do aluno é " + riquelmy.getName() +
                                " e ele tem a matricula de numero: " + riquelmy.getMatricula());
    }
}
