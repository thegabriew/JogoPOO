public class Necromante extends Personagem {
    public Necromante(String poderes) {
        super(poderes);
    }

    public void decomposicao(Personagem alvo) {
        System.out.println("Necromante usou Decomposição em " + alvo.getNome());
        alvo.setVida(alvo.getVida() - 50);
    }

    public void evocacaoDosMortos(Personagem alvo) {
        System.out.println("Necromante usou Evocação dos Mortos em " + alvo.getNome());
        alvo.setVida(alvo.getVida() - 100);
    }

    public void sombraDaMorte(Personagem alvo) {
        System.out.println("Necromante usou Sombra da Morte em " + alvo.getNome());
        alvo.setVida(alvo.getVida() - 150);
    }

    public void descricao() {
        System.out.println("\nDescrição do Personagem\n");
        System.out.println("Nome: Necromante");
        System.out.println("Vida: 500");
        System.out.println("Arma: Nenhuma");
        System.out.println("Poderes: Decomposição, Evocação dos Mortos, Sombra da Morte");
        System.out.println("Descrição: Criaturas temidas e perigosas, cujo domínio se estende pelas Terras Corrompidas, onde a morte se torna vida sob sua influência sombria. Vestidos com mantos negros que parecem absorver a luz, Necromantes são figuras espectrais que caminham entre as sombras, com olhos brilhando com uma luz cadavérica.");
  }
}
