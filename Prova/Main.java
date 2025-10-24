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

        // Testes com diferentes notas
        System.out.println("\n--- Teste com nota abaixo do mínimo ---");
        prova.registrarNota(59); // abaixo de 60% de 100
        System.out.println("Aprovado? " + prova.verificarAprovacao());

        System.out.println("\n--- Teste com nota mínima ---");
        prova.registrarNota(60); // exatamente 60%
        System.out.println("Aprovado? " + prova.verificarAprovacao());

        System.out.println("\n--- Teste com nota acima do mínimo ---");
        prova.registrarNota(85); // acima de 60%
        System.out.println("Aprovado? " + prova.verificarAprovacao());

        // Alterando dados da prova
        System.out.println("\n--- Alterando dados da prova ---");
        prova.setDisciplina("Física");
        prova.setNotaMaxima(80);
        prova.setTitulo("Prova de Física");

        System.out.println("Novo título: " + prova.getTitulo());
        System.out.println("Nova disciplina: " + prova.getDisciplina());
        System.out.println("Nova nota máxima: " + prova.getNotaMaxima());

        // Teste de validação de nota (se você ativar no método registrarNota da classe Prova)
        System.out.println("\n--- Teste de nota inválida ---");
        prova.registrarNota(200); // fora do limite
    }
}
