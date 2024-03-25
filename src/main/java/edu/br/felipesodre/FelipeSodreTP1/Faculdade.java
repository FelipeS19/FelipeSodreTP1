package edu.br.felipesodre.FelipeSodreTP1;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import edu.br.felipesodre.FelipeSodreTP1.model.domain.Aluno;

@Component
public class Faculdade implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
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

        exibirInformacoesAluno(aluno1);
        exibirInformacoesAluno(aluno2);
    }

    public static void exibirInformacoesAluno(Aluno aluno) {
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("Nota: " + aluno.getMedia());
        System.out.println("Situação: " + aluno.verificarAprovacao());
        System.out.println();
    }

}
