package edu.br.felipesodre.FelipeSodreTP1.model.domain;

public class Aluno {
    private String nome;
    private int idade;
    private String curso;
    private double media;

    public Aluno() {}


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String verificarAprovacao() {
        if (media >= 7.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
