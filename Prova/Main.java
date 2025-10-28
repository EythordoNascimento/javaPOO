import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Instanciar duas provas
        Prova prova1 = new Prova("Prova 1", new Date(), "Programação Orientada a Objetos", 10);
        Prova prova2 = new Prova("Prova 2", new Date(), "Programação Orientada a Objetos", 10);

        // Receber duas notas
        System.out.print("Digite a nota da Prova 1: ");
        prova1.registrarNota(entrada.nextFloat());

        System.out.print("Digite a nota da Prova 2: ");
        prova2.registrarNota(entrada.nextFloat());

        // Atribuir as notas recebidas
          boolean aprovado1 = prova1.verificarAprovacao();
          boolean aprovado2 = prova2.verificarAprovacao();

        // Verificar o Perfil do aluno
        String perfil;
        if (aprovado1 && aprovado2) {
            perfil = "Ótimo";
        } else if (aprovado1 || aprovado2) {
            perfil = "Regular";
        } else {
            perfil = "Ruim";
        }

        // Exibir resultado
        System.out.println("\nPerfil do aluno: " + perfil);

        entrada.close();
    }
}
