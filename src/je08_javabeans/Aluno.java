package je08_javabeans;

public class Aluno {
    private String name;
    private int matricula;

    public String getName() {
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int newMatricula) {
        this.matricula = newMatricula;
    }
}
