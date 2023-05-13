import java.util.List;
import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private String codigo;
    private List<Estudante> estudantesMatriculados;
    private Professor professorResponsavel;

    public Disciplina(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.estudantesMatriculados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Estudante> getEstudantesMatriculados() {
        return estudantesMatriculados;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public void adicionarEstudante(Estudante e) {
        this.estudantesMatriculados.add(e);
        Matricula matricula = new Matricula(e, this);
        e.getMatriculas().add(matricula);
    }

    public void removerEstudante(Estudante e) {
        this.estudantesMatriculados.remove(e);
        e.getMatriculas().removeIf(matricula -> matricula.getDisciplina().equals(this));
    }
}
