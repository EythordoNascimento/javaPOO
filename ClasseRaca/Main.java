package ClasseRaca;

public class Main {
    public static void main(String[] args) {

        
        Raca raca1 = new Raca(1, "Raça A", "Espécie X", "País 1");
        Raca raca2 = new Raca(2, "Raça B", "Espécie Y", "País 2");
        Raca raca3 = new Raca(3, "Raça C", "Espécie Z", "País 3");
        Raca raca4 = new Raca(4, "Raça D", "Espécie W", "País 4");

        
        Raca[] racas = {raca1, raca2, raca3, raca4};

        
        raca1.analisarExtincao(true, true, true, false); 
        raca1.analisarExtincao(true, true, true, true); 
        raca4.analisarExtincao(true, false, true, true); 

        
        System.out.print("Teste 1 (primeiro em extinção): ");
        resultadoTeste(raca1.getRiscoDeExtincao() == true);

        System.out.print("Teste 2 (quarto em extinção): ");
        resultadoTeste(raca4.getRiscoDeExtincao() == true);

        
        raca1.analisarExtincao(false, false, true, false); 

       
        System.out.print("Teste 3 (primeiro fora de extinção): ");
        resultadoTeste(raca1.getRiscoDeExtincao() == false);
    }

    
    static void resultadoTeste(boolean teste) {
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_RESET = "\u001B[0m";

        System.out.println((teste
                ? ANSI_GREEN + "Passou"
                : ANSI_RED + "Não passou")
                + ANSI_RESET);
    }
}
