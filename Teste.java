
import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando personagens
        Personagem personagem1 = criarPersonagem("Personagem 1");
        Personagem personagem2 = criarPersonagem("Personagem 2");

        // Solicitando ao usuário escolher um personagem
        System.out.println("Escolha o personagem:");
        System.out.println("1. " + personagem1.getNome());
        System.out.println("2. " + personagem2.getNome());

        int escolha = scanner.nextInt();
        Personagem jogador1, jogador2;

        // Atribuindo personagens aos jogadores com base na escolha do usuário
        if (escolha == 1) {
            jogador1 = personagem1;
            jogador2 = personagem2;
        } else {
            jogador1 = personagem2;
            jogador2 = personagem1;
        }

        // Simulando rodadas de ataque
        for (int rodada = 1; rodada <= 3; rodada++) {
            System.out.println("\nRodada " + rodada + ":");

            // Jogador 1 ataca Jogador 2
            jogador1.Atacar(jogador2, criarAtaque());

            if (jogador2.getVida() <= 0) {
                System.out.println(jogador2.getNome() + " foi derrotado!");
                break;
            }

            // Jogador 2 ataca Jogador 1
            jogador2.Atacar(jogador1, criarAtaque());

            if (jogador1.getVida() <= 0) {
                System.out.println(jogador1.getNome() + " foi derrotado!");
                break;
            }
        }

        // Exibindo o estado final dos personagens
        System.out.println("\nEstado final dos personagens:");
        System.out.println(jogador1.getNome() + ": Vida - " + jogador1.getVida());
        System.out.println(jogador2.getNome() + ": Vida - " + jogador2.getVida());

        scanner.close();
    }

    // Método para criar um personagem com base no nome fornecido
    private static Personagem criarPersonagem(String nome) {
        System.out.println("Criando " + nome + ":");
        System.out.println("Escolha a arma para " + nome + ":");
        System.out.println("1. Adaga");
        System.out.println("2. Katana, Shuriken");

        Scanner scanner = new Scanner(System.in);
        int escolhaArma = scanner.nextInt();

        String armas, poderes;

        // Atribuir armas e poderes com base na escolha
        if (escolhaArma == 1) {
            armas = "Adaga";
            poderes = "Ameaça Soturna, Degolador, Desmembrador";
        } else {
            armas = "Katana, Shuriken";
            poderes = "Katana: Lâmina Sangrenta, Corte Duplo; Shuriken: Lâminas Voadoras";
        }

        return nome.equals("Personagem 1") ? new Assassino(armas, poderes) : new Espadachim(armas, poderes);
    }

    // Método para criar um ataque simples
    private static Ataque criarAtaque() {
        // Aqui você pode adicionar lógica para permitir ao usuário escolher um tipo de ataque ou criar ataque customizado
        return new Ataque(50); // Por enquanto, todos os ataques causam 50 de dano
    }
}
