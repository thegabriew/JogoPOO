public class Personagem {
  private String armas;
  private String poderes;
  private int vida = 500;

  public Personagem(String armas, String poderes) {
    this.armas = armas;
    this.poderes = poderes;
  }

  public void Atacar(Personagem alvo, Ataque ataque) {
    int dano = ataque.getDano();
    alvo.receberDano(dano);
  }

  public void receberDano (int dano){

    vida = vida - dano;
    if(vida<=0){
      System.out.println("O personagem morreu");
    }
  }
}
