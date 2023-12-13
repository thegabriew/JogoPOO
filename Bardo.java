public class Bardo extends Personagem {

  public Bardo(String armas, String poderes) {
        super(armas, poderes);
  }

  public void MelodiaInfernal(Personagem alvo) {
        System.out.println("Bardo usou Cítara: Melodia Infernal em " + alvo.getNome());
        alvo.setVida(alvo.getVida() - 50);
    
  }

  public void SonoProfundo(Personagem alvo) {
        System.out.println("Bardo usou Cítara: Sono Profundo em " + alvo.getNome());
        alvo.setVida(alvo.getVida() - 100);
  }

  public void SomDoLamento(Personagem alvo) {
        System.out.println("Bardo usou Cítara: Som do Lamento em " + alvo.getNome());
        alvo.setVida(alvo.getVida() - 150);
    
  }

  public void descricao() {
    System.out.println("\nDescrição do Personagem\n");
    System.out.println("Nome: Bardo");
    System.out.println("Vida: 500");
    System.out.println("Arma: Cítara");
    System.out.println("Poderes: Melodia Infernal, Sono Profundo, Som do Lamento");
    System.out.println("Descrição: Um bardo enigmático cuja melodia encantadora oculta uma natureza traiçoeira. Seu sorriso malicioso revela uma destreza musical que transcende a mera arte, pois cada acorde é uma invocação de poderes sombrios.");
  }
}
