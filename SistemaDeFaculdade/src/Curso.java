import java.util.List;
import java.util.ArrayList;

public class Curso {
    private String nome;
    private String codigo;
    private List<Disciplina> disciplinas = new ArrayList<>();
    private List<Estudante> estudantes;
    

    public Curso(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.disciplinas = new ArrayList<>();
        this.estudantes = new ArrayList<>();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarDisciplina(Disciplina d) {
        this.disciplinas.add(d);
    }

    public void removerDisciplina(Disciplina d) {
        this.disciplinas.remove(d);
    }

    public void adicionarEstudante(Estudante e) {
        this.estudantes.add(e);
    }

    public void removerEstudante(Estudante e) {
        this.estudantes.remove(e);
    }
    
}
