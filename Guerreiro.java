public class Guerreiro extends Personagem {

  public Guerreiro(String armas, String poderes) {
        super(armas, poderes);
  }

  public void CorteProfundo(Personagem alvo) {
        System.out.println("Guerreiro usou Espada Excalibur: Corte Profundo em " + alvo.getNome());
        alvo.setVida(alvo.getVida() - 50);
  }

  public void SangueDeAvalon(Personagem alvo) {
        System.out.println("Guerreiro usou Espada Excalibur: Sangue de Avalon em " + alvo.getNome());
        alvo.setVida(alvo.getVida() - 150);
  }

  public void AtaqueRapido(Personagem alvo) {
        System.out.println("Guerreiro usou Espada Excalibur: Ataque Rápido em " + alvo.getNome());
        alvo.setVida(alvo.getVida() - 50);
  }

  public void decapitador(Personagem alvo) {
        System.out.println("Guerreiro usou Machado de Guerra: Decapitador em " + alvo.getNome());
        alvo.setVida(alvo.getVida() - 100);
  }

  public void descricao() {
        System.out.println("\nDescrição do Personagem\n");
        System.out.println("Nome: Guerreiro");
        System.out.println("Vida: 500");
        System.out.println("Arma: Espada Excalibur, Machado de Guerra");
        System.out.println("Poderes: Espada Excalibur: Corte Profundo, Sangue de Avalon, Ataque Rápido; Machado de Guerra: Decapitador");
        System.out.println("Descrição: Um guerreiro formidável, conhecido em todo o reino pela sua bravura e habilidade no campo de batalha. Ele é um homem de estatura imponente, com olhos penetrantes que refletem uma determinação inabalável.");
  }
}
