package controletelevisao;

public class Testecontrole {
    public static void main(String[] args) {
        
        
        controle controle = new controle(1, "Samsung");
        System.out.println("ID do Controle: " + controle.getIdControle());
        System.out.println("Modelo: " + controle.getModelo());
        System.out.println("Canal Atual: " + controle.getCanalAtual());
        System.out.println("Ligado: " + controle.isLigado());

        System.out.println("\n--- Testes ---");

       
        System.out.println("Ligando controle...");
        controle.ligarDesligar();
        System.out.println("Ligado: " + controle.isLigado());
        System.out.println("Canal Atual: " + controle.getCanalAtual());

        
        System.out.println("Avançar canal: " + controle.avancarCanal());

        
        System.out.println("Ir para canal 7: " + controle.irParaCanal(7));

       
        System.out.println("Ir para canal 1: " + controle.irParaCanal(1));

        System.out.println("Canal Atual: " + controle.getCanalAtual());

       
        System.out.println("Retornar canal: " + controle.retornarCanal());

       
        System.out.println("Desligando controle...");
        controle.ligarDesligar();
        System.out.println("Ligado: " + controle.isLigado());
        System.out.println("Canal Atual: " + controle.getCanalAtual());

        
        System.out.println("Avançar canal com controle desligado: " + controle.avancarCanal());
    }
}
