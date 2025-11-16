import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Impressora impressora = null;

        System.out.println("Cadastro da Impressora:");
        System.out.print("Digite o ID da impressora: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // limpar buffer
        System.out.print("Digite o tipo da impressora: ");
        String tipo = scanner.nextLine();
        impressora = new Impressora(id, tipo);
        impressora.mostrarDados();

        // Enviar 3 arquivos
        for (int i = 1; i <= 3; i++) {
            System.out.print("\nDigite o nome do arquivo " + i + " para imprimir: ");
            String nomeArquivo = scanner.nextLine();
            impressora.recebeImpressao(nomeArquivo);
            impressora.mostrarDados();
        }

        // Finalizar 4 impressões
        for (int i = 1; i <= 4; i++) {
            System.out.println("\nFinalizando impressão " + i);
            impressora.finalizaImpressao();
            impressora.mostrarDados();
        }

        scanner.close();
    }
}
