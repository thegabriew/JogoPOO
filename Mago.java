public class Mago extends Personagem {

  public Mago(String armas, int vida) {
    super(armas, vida);
  }

 
   public void veneno(Personagem alvo) {
   System.out.println("O mago usou veneno em " + alvo.getNome());
   alvo.setVida(alvo.getVida() - 50);
   }
    
    public void TempestadeDeRaios(Personagem alvo) {
    
    System.out.println("O mago usou Tempestade de raios em " + alvo.getNome());
    alvo.setVida(alvo.getVida() - 100);
    }
    
    public void EvocacaoDoFogo(Personagem alvo) {
    System.out.println("O mago usou Evocacao do fogo em " + alvo.getNome());
    alvo.setVida(alvo.getVida() - 150);
   }
   
}
