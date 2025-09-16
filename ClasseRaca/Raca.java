package ClasseRaca;

public class Raca {
    
      // atributos 
    private final int idRaca;            
    private String nome;
    private String especie;
    private String paisDeOrigem;
    private Boolean riscoDeExtincao;      

    // construtor
    public Raca(int idRaca, String nome, String especie, String paisDeOrigem) {
        this.idRaca = idRaca;
        this.nome = nome;
        this.especie = especie;
        this.paisDeOrigem = paisDeOrigem;
        this.riscoDeExtincao = false;  
    }

    // Getters
    public int getIdRaca() {
        return idRaca;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public String getPaisDeOrigem() {
        return paisDeOrigem;
    }

    public Boolean getRiscoDeExtincao() {
        return riscoDeExtincao;
    }

    // Setters (apenas para atributos que podem ser alterados)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setPaisDeOrigem(String paisDeOrigem) {
        this.paisDeOrigem = paisDeOrigem;
    }

    
    public void analisarExtincao(boolean criterio1, boolean criterio2, boolean criterio3, boolean criterio4) {
        int pontos = 0;

        // Critérios 1 e 2 → peso 1
        if (criterio1) pontos += 1;
        if (criterio2) pontos += 1;

        // Critérios 3 e 4 → peso 2
        if (criterio3) pontos += 2;
        if (criterio4) pontos += 2;

        // Atualiza risco de extinção
        this.riscoDeExtincao = pontos >= 5;
    }
}
