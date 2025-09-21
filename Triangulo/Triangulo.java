package Triangulo;

public class Triangulo {
    
    private int idTriangulo;
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double area;   
    private String tipo;

    // construtor
    public Triangulo(int idTriangulo, double ladoA, double ladoB, double ladoC) {
        this.idTriangulo = idTriangulo;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;

        calcularArea();
        definirTipo();   
    }

    // Verifica se realmente forma um triângulo
    private boolean formaTriangulo() {
        return (ladoA + ladoB > ladoC) &&
               (ladoA + ladoC > ladoB) &&
               (ladoB + ladoC > ladoA);
    }

    // Calcula a área 
    private void calcularArea() {
        if (formaTriangulo()) {
            double sp = (ladoA + ladoB + ladoC) / 2.0;
            this.area = Math.sqrt(sp * (sp - ladoA) * (sp - ladoB) * (sp - ladoC));
        } else {
            this.area = 0;
        }
    }

    // Define o tipo do triângulo
    private void definirTipo() {
        if (!formaTriangulo()) {
            this.tipo = "Indefinido";
        } else if (ladoA == ladoB && ladoB == ladoC) {
            this.tipo = "Equilátero";
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            this.tipo = "Isósceles";
        } else {
            this.tipo = "Escaleno";
        }
    }

    // apenas getters pq (Nenhum atributo pode ser alterado livremente.)
    public int getIdTriangulo() {
        return idTriangulo;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public double getArea() {
        return area;
    }

    public String getTipo() {
        return tipo;
    }

      // Para imprimir os dados do triângulo
      @Override
      public String toString() {
          return "Triângulo " + idTriangulo +
                 " [lados: " + ladoA + ", " + ladoB + ", " + ladoC +
                 " | área: " + String.format("%.2f", area) +
                 " | tipo: " + tipo + "]";
      }
}
