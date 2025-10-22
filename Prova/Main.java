package Prova;

import java.util.Date;


public class Main {
    public static void main(String[] args) {
        // Criando uma prova com nota máxima de 100
        Prova prova = new Prova("Prova de Matemática", new Date(), "Matemática", 100);

        // Registrando a nota do aluno
        prova.registrarNota(65);

        // Verificando se foi aprovado
        if (prova.verificarAprovacao()) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }

        // Exibindo dados da prova
        System.out.println("Título: " + prova.getTitulo());
        System.out.println("Disciplina: " + prova.getDisciplina());
        System.out.println("Nota do aluno: " + prova.getNotaAluno());
        System.out.println("Nota máxima: " + prova.getNotaMaxima());
    }
}