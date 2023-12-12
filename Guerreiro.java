public class Guerreiro extends Personagem {
  public Guerreiro(String armas) {
    super(armas);
  }

  public void CorteProfundo(Personagem alvo) {
    System.out.println("Guerreiro usou Espada Excalibur: Corte Profundo em " + alvo.getNome());
      alvo.setVida(dois.getVida() - 50);
  }

  public void SangueDeAvalon(Personagem alvo) {
    System.out.println("Guerreiro usou Sangue de Avalon em " + alvo.getNome());
      alvo.setVida(dois.getVida() - 150);
  }

  public void AtaqueRapido(Personagem dois) {
    System.out.println("Guerreiro usou Ataque Rápido em " + alvo.getNome());
      alvo.setVida(dois.getVida() - 50);
  }
}
