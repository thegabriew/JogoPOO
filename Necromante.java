public class Necromante extends Personagem{

  public Necromante(String armas, int vida){
    super(armas, vida);
  }

  public class EvocacaoDosMortos (Personagem alvo){
System.out.println("Necromante usou Evocação dos mortos em: " + alvo.getNome());
    alvo.setVida(alvo.getVida() - 150);
  
  }

  public class Decomposicao (Personagem alvo){
    System.out.println("Necromante usou Decomposição em: " + alvo.getNome());
    alvo.setVida(alvo.getVida() - 50);

}

  public class SombraDaMorte (Personagem alvo){
    System.out.println("Necromante usou Sombra da Morte em: " + alvo.getNome());
  alvo.setVida(alvo.getVida() - 100);

}
}
