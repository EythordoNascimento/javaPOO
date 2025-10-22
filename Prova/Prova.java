package Prova;

import java.util.Date;

public class Prova {
    private String titulo;
    private Date data;
    private String disciplina;
    private float notaMaxima;
    private float notaAluno;

    // Construtor
    public Prova(String titulo, Date data, String disciplina, float notaMaxima) {
        this.titulo = titulo;
        this.data = data;
        this.disciplina = disciplina;
        this.notaMaxima = notaMaxima;
        this.notaAluno = 0; 
    }

    // Método para registrar a nota do aluno
    public void registrarNota(float nota) {
        this.notaAluno = nota;
    }

    // Método para verificar se o aluno foi aprovado
    public boolean verificarAprovacao() {
        return notaAluno >= (0.6f * notaMaxima);
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public Date getData() {
        return data;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public float getNotaMaxima() {
        return notaMaxima;
    }

    public float getNotaAluno() {
        return notaAluno;
    }

    // Setters (apenas para os atributos que podem ser alterados)
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setNotaMaxima(float notaMaxima) {
        this.notaMaxima = notaMaxima;
    }

    // Não criamos setNotaAluno para manter o controle via registrarNota()
}