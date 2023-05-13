import java.util.List;
import java.util.ArrayList;

public class Estudante extends Pessoa {
    private String matricula;
    private Curso curso;
    private List<Disciplina> disciplinas;
    private List<Matricula> matriculas = new ArrayList<>();

    public Estudante(String nome, int idade, String endereco, String matricula) {
        super(nome, idade, endereco);
        this.matricula = matricula;
        this.disciplinas = new ArrayList<>();}

        public List<Matricula> getMatriculas() {
            return matriculas;
    }
        public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
    public void matricularEmDisciplina(Disciplina d) {
        this.disciplinas.add(d);
        d.adicionarEstudante(this);
    }

    public void cancelarMatricula(Disciplina d) {
        this.disciplinas.remove(d);
        d.removerEstudante(this);
    }

    public void verificarNotas() {
        
    }

    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Matrícula: " + matricula);
        
    }
}
