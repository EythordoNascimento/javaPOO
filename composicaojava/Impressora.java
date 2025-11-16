import java.util.ArrayList;
import java.util.List;

public class Impressora {
    private int id;
    private String tipo;
    private boolean imprimindo;
    private List<Impressao> impressoes;

    public Impressora(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
        this.imprimindo = false;
        this.impressoes = new ArrayList<>();
    }

    public void recebeImpressao(String nomeArquivo) {
        Impressao nova = new Impressao(nomeArquivo);
        impressoes.add(nova);
        if (impressoes.size() == 1) {
            nova.registraInicio();
            imprimindo = true;
        }
    }

    public boolean finalizaImpressao() {
        if (impressoes.isEmpty()) {
            System.out.println("Não tem impressão para finalizar.");
            return false;
        }
        impressoes.remove(0);
        if (!impressoes.isEmpty()) {
            impressoes.get(0).registraInicio();
            imprimindo = true;
        } else {
            imprimindo = false;
        }
        return true;
    }

    public void mostrarDados() {
        String estado = imprimindo ? "Imprimindo" : "Em espera";
        System.out.println("\nImpressora " + id + " (" + tipo + ") - " + estado);
        System.out.println("Fila de Impressões:");
        if (impressoes.isEmpty()) {
            System.out.println("Vazia");
        } else {
            for (Impressao imp : impressoes) {
                System.out.println(imp);
            }
        }
    }
}