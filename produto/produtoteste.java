package produto;

public class produtoteste {

	public static void main(String[] args) {
		
		produto prod = new produto();

		prod.codigo = 120;
		prod.descricao = "Mouse";
		prod.precoCusto = 50.35;		
		
		mostrarMensagem( prod.aumentarEstoque(15)  == 15 );
		
		mostrarMensagem( prod.baixarEstoque(7)  == 8 );
		
		mostrarMensagem( prod.baixarEstoque(10)  == -1 );
		
		System.out.println("Estoque atual: " + prod.qtdeEmEstoque);
		
		mostrarMensagem(prod.calcularValorEstoque() == 402.8 );

	}
	
    static void mostrarMensagem(boolean teste){
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_RED   = "\u001B[31m";
        final String ANSI_RESET = "\u001B[0m";

        System.out.println( (teste 
        		             ? ANSI_GREEN + "Passou"
        		             : ANSI_RED + "Não passou")
        		             + ANSI_RESET);
    }	


}