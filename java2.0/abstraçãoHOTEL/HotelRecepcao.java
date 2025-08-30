package abstraçãoHOTEL;

import java.util.Scanner;

public class HotelRecepcao {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

     
        System.out.print("Digite o nome do hóspede: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o CPF do hóspede: ");
        String cpf = entrada.nextLine();

        
        Hospede hospede = new Hospede(nome, cpf);
        Quarto quarto = new Quarto(101);

        mostrarHospede(hospede);
        mostrarQuarto(quarto);

        realizarCheckIn(hospede, quarto);
        mostrarQuarto(quarto);

        realizarCheckOut(hospede, quarto);
        mostrarQuarto(quarto);

        entrada.close();
    }

    static void mostrarHospede(Hospede h) {
        System.out.println("Hóspede: " + h.nome + " | CPF: " + h.cpf);
    }

    static void mostrarQuarto(Quarto q) {
        String status = q.ocupado ? "ocupado" : "disponível";
        System.out.println("Quarto " + q.numero + " está " + status);
    }

    static void realizarCheckIn(Hospede h, Quarto q) {
        if (!q.ocupado) {
            q.ocupado = true;
            System.out.println(h.nome + " fez check-in no quarto " + q.numero);
        } else {
            System.out.println("Quarto " + q.numero + " já está ocupado.");
        }
    }

    static void realizarCheckOut(Hospede h, Quarto q) {
        if (q.ocupado) {
            q.ocupado = false;
            System.out.println(h.nome + " fez check-out do quarto " + q.numero);
        } else {
            System.out.println("Quarto " + q.numero + " já está livre.");
        }
    }

    static class Hospede {
        String nome;
        String cpf;

        Hospede(String nome, String cpf) {
            this.nome = nome;
            this.cpf = cpf;
        }
    }

    
    static class Quarto {
        int numero;
        boolean ocupado;

        Quarto(int numero) {
            this.numero = numero;
            this.ocupado = false;
        }
    }
}