package edu.br.felipesodre.FelipeSodreTP1.model.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import edu.br.felipesodre.FelipeSodreTP1.model.domain.Aluno;

@SpringBootTest
class FelipeSodreTp1ApplicationTests {

	@Test
	void contextLoads() {
	}
	
	private Aluno aluno;

    @BeforeEach
    void setUp(){
        aluno = new Aluno();
        aluno.setNome("Ana");
        aluno.setIdade(20);
        aluno.setCurso("Psicologia");
        aluno.setMedia(7.0);
    }

    @Test
    @DisplayName("Verificar aprovação com média igual a 7")
    public void testMediaSete() {
        aluno.setMedia(7.0);
        assertEquals("Aprovado", aluno.verificarAprovacao());
    }

    @Test
    @DisplayName("Verificar reprovação com média menor que 7")
    public void testMediaMenorSete() {
        aluno.setMedia(5.0);
        assertEquals("Reprovado", aluno.verificarAprovacao());
    }

    @Test
    @DisplayName("Verificar reprovação com média igual a 0")
    public void testMediaZero() {
        aluno.setMedia(0);
        assertEquals("Reprovado", aluno.verificarAprovacao());
    }

    @Test
    @DisplayName("Verificar reprovação com média negativa")
    public void testMediaNegativa() {
        aluno.setMedia(-1);
        assertEquals("Reprovado", aluno.verificarAprovacao());
    }

    @Test
    @DisplayName("Verificar se a idade é maior que zero")
    public void testIdadeMaiorQueZero() {
        Aluno aluno = new Aluno();
        aluno.setIdade(20);
        assertTrue(aluno.getIdade() > 0);
    }


}
