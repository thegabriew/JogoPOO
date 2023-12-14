public class Espadachim extends Personagem {
    public Espadachim(String armas, String poderes) {
        super(armas, poderes);
    }

    public void laminaSangrenta(Personagem alvo) {
        System.out.println("Espadachim usou Katana: Lâmina Sangrenta em " + alvo.getNome());
        alvo.setVida(alvo.getVida() - 50);
    }

    public void corteDuplo(Personagem alvo) {
        System.out.println("Espadachim usou Katana: Corte Duplo em " + alvo.getNome());
        alvo.setVida(alvo.getVida() - 100);
    }

    public void laminasVoadoras(Personagem alvo) {
        System.out.println("Espadachim usou Shuriken: Lâminas Voadoras em " + alvo.getNome());
        alvo.setVida(alvo.getVida() - 150);
    }

    public void descricao() {
        System.out.println("\nDescrição do Personagem\n");
        System.out.println("Nome: Espadachim");
        System.out.println("Vida: 500");
        System.out.println("Arma: Katana, Shuriken");
        System.out.println("Poderes: Katana: Lâmina Sangrenta, Corte Duplo; Shuriken: Lâminas Voadoras");
        System.out.println("Descrição: Ágeis e letais, Espadachins dançam no campo de batalha como uma tempestade de aço. Suas lâminas cortam o ar com precisão mortal, e cada movimento é executado de forma fria e calculada.");
    }
}