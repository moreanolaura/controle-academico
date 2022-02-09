import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ProfessorTest {
    @Test
    public void testeLancarNotas(){
        Professor professor = new Professor();

        // quando eu faco...
        professor.lancarNotas();

        // entao eu epero que aconteca...
        assertNotNull("Deveriam existir notas", professor);
    }

    @Test
    public void testeLancarFaltas(){
        Professor professor = new Professor();

        // quando eu faco...
        professor.lancarFaltas();

        // entao eu epero que aconteca...
        assertNotNull("Deveriam existir faltas", professor);
    }
}
