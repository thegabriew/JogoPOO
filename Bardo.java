public class Bardo extends Personagem {

  public Bardo(String armas, String poderes) {
    super(armas, poderes);
  }

  public void MelodiaInfernal(Personagem alvo){
    System.out.println("Bardo usou Melodia Infernal em " + alvo.getNome());
    alvo.setVida(alvo.getVida() - 50);
    
  }

  public void SonoProfundo (Personagem alvo){

    System.out.println("Bardo usou Sono Profundo em " + alvo.getNome());
    alvo.setVida(alvo.getVida() - 100);
  }

  public void SomDoLamento (Personagem alvo){

    System.out.println("Bardo usou Som do Lamento em " + alvo.getNome());
    alvo.setVida(alvo.getVida() - 150);
    
  }
}
