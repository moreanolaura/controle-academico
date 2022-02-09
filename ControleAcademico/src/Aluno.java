public class Aluno extends Usuario{

    private int numeroMatricula;
    private int telefone;
    private String curso;

    public Aluno() {
        super();
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Aluno(String nomeCompleto, String login, String senha, String email, int numeroMatricula, int telefone, String Curso) {
        super(nomeCompleto, login, senha, email);
    }

    public void verNotas(){

    }

    public void verFrequencias(){

    }
}
