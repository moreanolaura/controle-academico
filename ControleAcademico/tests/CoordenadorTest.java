import org.junit.Test;
import static org.junit.Assert.*;

public class CoordenadorTest {
    @Test
    public void testeCriarDisciplina(){
        Coordenador coordenador = new Coordenador();

        // quando eu faco...
        coordenador.criarDisciplina();

        // entao eu epero que aconteca...
        assertNotNull("Deve existir uma disciplina", coordenador);
    }

    @Test
    public void testeDeletarDisciplina(){
        Coordenador coordenador = new Coordenador();

        // quando eu faco...
        coordenador.deletarDisciplina();

        // entao eu epero que aconteca...
        assertNotNull("Disciplina deveria ter sido deletada", coordenador);
    }

    @Test
    public void testeCriarTurma(){
        Coordenador coordenador = new Coordenador();

        // quando eu faco...
        coordenador.criarTurma();

        // entao eu epero que aconteca...
        assertNotNull("Deve existir uma turma", coordenador);
    }

    @Test
    public void testeDeletarTurma(){
        Coordenador coordenador = new Coordenador();

        // quando eu faco...
        coordenador.deletarTurma();

        // entao eu epero que aconteca...
        assertNotNull("Turma deveria ter sido delatada", coordenador);
    }

    @Test
    public void testeMatricularAlunos(){
        Coordenador coordenador = new Coordenador();

        // quando eu faco...
        coordenador.matricularAlunos();

        // entao eu epero que aconteca...
        assertNotNull("Devem existir alunos matriculados", coordenador);
    }
}
