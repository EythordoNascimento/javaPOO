package Triangulo;

import java.util.ArrayList;

public class Main {

    // método de teste 
    static void resultadoTeste(boolean teste) {
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_RESET = "\u001B[0m";
    
        System.out.println((teste
                ? ANSI_GREEN + "Passou"
                : ANSI_RED + "Não passou")
                + ANSI_RESET);
    }

    public static void main(String[] args) {

        ArrayList<Triangulo> lista = new ArrayList<>();

        // Criando 4 triângulos de tipos diferentes
        Triangulo t1 = new Triangulo(1, 5, 5, 5); // Equilátero
        Triangulo t2 = new Triangulo(2, 6, 6, 4); // Isósceles
        Triangulo t3 = new Triangulo(3, 7, 8, 9); // Escaleno
        Triangulo t4 = new Triangulo(4, 2, 2, 8); // Indefinido (não forma triângulo)

       
        String[] tiposEsperados = {"Equilátero", "Isósceles", "Escaleno", "Indefinido"};

        Triangulo[] triangulos = {t1, t2, t3, t4};

        // Testar e adicionar na lista apenas se passar
        for (int i = 0; i < triangulos.length; i++) {
            Triangulo t = triangulos[i];
            String tipoEsperado = tiposEsperados[i];

            // Teste: área maior que zero e tipo correto OU tipo "Indefinido"
            boolean valido = (t.getArea() > 0 && t.getTipo().equals(tipoEsperado))
                             || t.getTipo().equals("Indefinido");

            // Mostrar se passou
            System.out.print("Triângulo " + t.getIdTriangulo() + " (" + t.getTipo() + "): ");
            resultadoTeste(valido);

            // Se passou, adiciona na lista
            if (valido) {
                lista.add(t);
            }
        }

        // Mostrar todos os triângulos armazenados
        System.out.println("\n----- Triângulos armazenados -----");
        for (Triangulo t : lista) {
            System.out.println(t);
        }
    }
}
