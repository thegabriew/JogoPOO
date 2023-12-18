import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Dinamica {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Poder> poder = new ArrayList<>();

    private String nome;
    private int vida;
    private ArrayList<Poder> poderes;

    public Dinamica(String nome, int vida, ArrayList<Poder> poderes) {
        this.nome = nome;
        this.vida = vida;
        this.poderes = poderes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public ArrayList<Poder> getPoderes() {
        return poderes;
    }

    public void setPoderes(ArrayList<Poder> poderes) {
        this.poderes = poderes;
    }

    public void atacar(Dinamica alvo) {
        int escolha = (int) (Math.random() * 2);
        if (escolha == 0) {
            // O jogador escolhe um ataque
            System.out.println("Escolha um ataque:");
            for (Poder poder : poderes) {
                System.out.println(poder.getNome());
            }
            String ataqueEscolhido = scanner.nextLine();
            if (ataqueEscolhido.equals("sair")) {
                return;
            }
            // O jogador causa dano ao alvo
            alvo.setVida(alvo.getVida() - poderes.get(ataqueEscolhido).getDano());
        } else {
            // O computador escolhe um ataque
            int indiceAtaque = (int) (Math.random() * poderes.size());
            Poder poderEscolhido = poderes.get(indiceAtaque);
            // O computador causa dano ao alvo
            alvo.setVida(alvo.getVida() - poderEscolhido.getDano());
        }
    }

    public static void main(String[] args) {
        // Cria os personagens
        Dinamica jogador1 = new Dinamica("Jogador 1", 1000, ArrayList.asList(new Poder("Corte profundo", 100), new Poder("Ataque rápido", 50)));
        Dinamica jogador2 = new Dinamica("Jogador 2", 1000, ArrayList.asList(new Poder("Veneno", 50), new Poder("Tempestade de raios", 100), new Poder("Evocação do fogo", 150)));

        // Sorteia quem começa
        int jogadorQueComeca = (int) (Math.random() * 2);
        if (jogadorQueComeca == 0) {
            System.out.println("O jogador 1 começa.");
        } else {
            System.out.println("O jogador 2 começa.");
        }

        // Loop do jogo
        while (jogador1.getVida() > 0 && jogador2.getVida() > 0) {
            // O jogador que começa ataca
            if (jogadorQueComeca == 0) {
                jogador1.atacar(jogador2);
            } else {
                jogador2.atacar(jogador1);
            }

            // Altera o jogador que começa
            jogadorQueComeca = (jogadorQueComeca + 1) % 2;
        }

        // Verifica o vencedor
        if (jogador1.getVida() > 0) {
            System.out.println("O jogador 1 venceu!");
        } else {
            System.out.println("O jogador 2 venceu!");
        }
    }
}
