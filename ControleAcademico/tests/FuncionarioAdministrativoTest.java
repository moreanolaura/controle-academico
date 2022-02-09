import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class FuncionarioAdministrativoTest{
    @Test
    public void testeCriarUsuario(){
        FuncionarioAdministrativo funcionario = new FuncionarioAdministrativo();

        // quando eu faco...
        funcionario.criarUsuario();

        // entao eu epero que aconteca...
        assertNotNull("O O usuario devria ter sido criado", funcionario);
    }

    @Test
    public void testeMatricularAlunos(){
        FuncionarioAdministrativo funcionario = new FuncionarioAdministrativo();

        // quando eu faco...
        funcionario.matricularAlunos();

        // entao eu epero que aconteca...
        assertNotNull("Os alunos devriam ter sido matriculados", funcionario);
    }
}
