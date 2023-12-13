public class Assassino extends Personagem {
    public Assassino(String armas, String poderes) {
        super(armas, poderes);
    }

    public void ameaçaSoturna(Personagem alvo) {
        System.out.println("Assassino usou Ameaça Soturna em " + alvo.getNome());
        alvo.setVida(alvo.getVida() - 50);
    }

    public void degolador(Personagem alvo) {
        System.out.println("Assassino usou Degolador em " + alvo.getNome());
        alvo.setVida(alvo.getVida() - 100);
    }

    public void desmembrador(Personagem alvo) {
        System.out.println("Assassino usou Desmembrador em " alvo.getNome());
        alvo.setVida(alvo.getVida() - 150);
    }

    public void descricao() {
        System.out.println("\nDescrição do Personagem\n");
        System.out.println("Nome: Assassino");
        System.out.println("Vida: 500");
        System.out.println("Arma: Adaga");
        System.out.println("Poderes: Ameaça Soturna, Degolador, Desmembrador");
        System.out.println("Descrição: Eles vagueiam pelas vielas em busca de sua próxima vítima, rastreando alvos com uma perícia assassina. Seus passos são rápidos e leves, sua presença é percebida apenas quando já é tarde demais.");
    }
}
