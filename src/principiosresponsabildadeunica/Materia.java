package principiosresponsabildadeunica;
public class Materia {
   private String nomeDisciplina;
    private float nota1;
    private float nota2;
    
    
    public float calcularMedia(float nota1, float nota2){
        float media; 
        media = (nota1 + nota2)/2;  
        return media;
    }

    public Materia(String nomeDisciplina, float nota1, float nota2) {
        this.nomeDisciplina = nomeDisciplina;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Materia(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    

    
}
