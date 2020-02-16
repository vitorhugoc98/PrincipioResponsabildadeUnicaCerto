package principiosresponsabildadeunica;

public class PrincipiosResponsabildadeUnica {

    public static void main(String[] args) {
     
        Aluno aluno00 = new Aluno("João", 1);
        Materia materia00 = new Materia("Padrão de Projeto", 1.2f, 9.9f);
        Matricula matricula00 = new Matricula(aluno00, materia00, "11/02/2020");
        
        
        System.out.println("Aluno: "+matricula00.getAluno().getNomeAluno()+" Disciplina: "+materia00.getNomeDisciplina()+" Data Matricula: "+matricula00.getData()+"Media: "+matricula00.getMateria().calcularMedia(5, 7));
    }
    
}
