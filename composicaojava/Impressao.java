public class Impressao {
    private static int contadorId = 1;
    private int id;
    private String nomeArquivo;
    private boolean status;

    public Impressao(String nomeArquivo) {
        this.id = contadorId++;
        this.nomeArquivo = nomeArquivo;
        this.status = false;
    }

    public void registraInicio() {
        this.status = true;
    }

    public boolean getStatus() {
        return status;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        String estado = status ? "Imprimindo" : "Aguardando";
        return "Impressão " + id + ": " + nomeArquivo + " - " + estado;
    }
}