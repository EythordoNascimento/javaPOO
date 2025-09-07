package controletelevisao;

public class controle {
    // Atributos privados
    private int idControle;
    private String modelo;
    private int canalAtual;
    private boolean ligado;

    // Construtor
    public controle(int idControle, String modelo) {
        this.idControle = idControle;
        this.modelo = modelo;
        this.ligado = false;
        this.canalAtual = 0;
    }

    // Método para ligar ou desligar
    public boolean ligarDesligar() {
        ligado = !ligado;
        canalAtual = ligado ? 1 : 0;
        return ligado;
    }

    // Método para avançar canal
    public int avancarCanal() {
        if (!ligado) return 0;
        canalAtual = (canalAtual % 5) + 1;
        return canalAtual;
    }

    // Método para retornar canal
    public int retornarCanal() {
        if (!ligado) return 0;
        canalAtual = (canalAtual == 1) ? 5 : canalAtual - 1;
        return canalAtual;
    }

    // Método para ir para canal específico
    public int irParaCanal(int canal) {
        if (!ligado) return 0;
        if (canal >= 1 && canal <= 5) {
            canalAtual = canal;
            return canalAtual;
        } else {
            return -1;
        }
    }

    // Getters
    public int getIdControle() {
        return idControle;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCanalAtual() {   // 🔹 corrigido para retornar int
        return canalAtual;
    }

    public boolean isLigado() {    // 🔹 adicionado para consultar estado
        return ligado;
    }
}
