package edu.br.felipesodre.FelipeSodreTP1;

import org.junit.jupiter.api.*;

import edu.br.felipesodre.FelipeSodreTP1.model.domain.Aluno;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FaculdadeTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    @DisplayName("Verificar saída do método exibirInformacoesAluno com Aluno Aprovado")
    public void testExibirInformacoesAlunoAlunoAprovado() {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("João");
        aluno1.setIdade(18);
        aluno1.setCurso("Engenharia");
        aluno1.setMedia(8.5);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Maria");
        aluno2.setIdade(19);
        aluno2.setCurso("Medicina");
        aluno2.setMedia(5.0);

        Faculdade.exibirInformacoesAluno(aluno1);
        Faculdade.exibirInformacoesAluno(aluno2);

        String output = outputStreamCaptor.toString();
        assertTrue(output.contains("Situação: Aprovado")); 
        assertTrue(output.contains("Situação: Reprovado"));
    }
}
