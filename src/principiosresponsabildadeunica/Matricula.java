package principiosresponsabildadeunica;
public class Matricula {
    private Aluno aluno;
    private Materia materia;
    private String data;
    
    
    public void matricularAluno(Aluno aluno,Materia materia){
        System.out.println("Matriculando aluno...");
    }

    public Matricula(Aluno aluno, Materia materia, String data) {
        this.aluno = aluno;
        this.materia = materia;
        this.data = data;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
}
