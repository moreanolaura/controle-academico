import org.junit.Test;
import static org.junit.Assert.*;


public class AlunoTest {

    @Test
    public void testeVerNotas(){
        Aluno aluno = new Aluno();

        // quando eu faco...
        aluno.verNotas();

        // entao eu epero que aconteca...
        assertNotNull("O aluno deve estar matriculado para ver suas notas", aluno);
    }

    @Test
    public void testeVerFrequencias(){
        Aluno aluno = new Aluno();

        // quando eu faco...
        aluno.verFrequencias();

        // entao eu epero que aconteca...
        assertNotNull("O aluno deve estar matriculado para ver suas frequências", aluno);
    }
}
