/*
Um usuário informa seu nome
 Digita os dados de uma música (título, artista, gênero, duração)
O sistema mostra essas informações e simula a reprodução da música

 */

package musica;

import java.util.Scanner;

public class streaming {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        
        System.out.print("Digite seu nome: ");
        String nomeUsuario = entrada.nextLine();
        Usuario usuario = new Usuario(nomeUsuario);

    
        System.out.print("Digite o nome da música: ");
        String tituloMusica = entrada.nextLine();

        System.out.print("Digite o nome do artista: ");
        String nomeArtista = entrada.nextLine();

        System.out.print("Digite o gênero musical: ");
        String generoArtista = entrada.nextLine();

        System.out.print("Digite a duração da música (em minutos): ");
        double duracaoMusica = entrada.nextDouble();
        entrada.nextLine(); 

        
        Artista artista = new Artista(nomeArtista, generoArtista);
        Musica musica = new Musica(tituloMusica, duracaoMusica, artista);

        mostrarUsuario(usuario);
        mostrarMusica(musica);
        reproduzirMusica(usuario, musica);

        entrada.close();
    }

    static void mostrarUsuario(Usuario u) {
        System.out.println("\n Usuário: " + u.nome);
    }

    static void mostrarMusica(Musica m) {
        System.out.println(" Música: " + m.titulo + " (" + m.duracao + " min)");
        System.out.println(" Artista: " + m.artista.nome + " | Gênero: " + m.artista.genero);
    }

    static void reproduzirMusica(Usuario u, Musica m) {
        System.out.println("\n " + u.nome + " está ouvindo \"" + m.titulo + "\" de " + m.artista.nome);
    }

    static class Usuario {
        String nome;
        Usuario(String nome) {
            this.nome = nome;
        }
    }

    static class Artista {
        String nome;
        String genero;
        Artista(String nome, String genero) {
            this.nome = nome;
            this.genero = genero;
        }
    }

    static class Musica {
        String titulo;
        double duracao;
        Artista artista;
        Musica(String titulo, double duracao, Artista artista) {
            this.titulo = titulo;
            this.duracao = duracao;
            this.artista = artista;
        }
    }
}
