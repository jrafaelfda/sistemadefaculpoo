import java.util.List;
import java.util.ArrayList;

public class Professor extends Pessoa {
    private String departamento;
    private List<Disciplina> disciplinasLecionadas;

    public Professor(String nome, int idade, String endereco, String departamento) {
        super(nome, idade, endereco);
        this.departamento = departamento;
        this.disciplinasLecionadas = new ArrayList<>();
    }

    public void atribuirNota(Estudante e, Disciplina d, double nota) {
        for (Matricula matricula : e.getMatriculas()) {
            if (matricula.getDisciplina().equals(d)) {
                matricula.setNota(nota);
                return;
            }
        }
    
        throw new IllegalArgumentException("O estudante não está matriculado na disciplina");
    }

    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Departamento: " + departamento);
        
    }
}
