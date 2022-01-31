import java.util.List;

public class Disciplina {

    private String nomeDisciplina;
    private String codigoDisciplina;

    private final List<Turma> turmas;

    public Disciplina(String nomeDisciplina, List<Turma> turmas) {
        this.nomeDisciplina = nomeDisciplina;
        this.turmas = turmas;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(String codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }
}
