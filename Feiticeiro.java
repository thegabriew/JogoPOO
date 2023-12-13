public class Feiticeiro extends Personagem {

    public Feiticeiro(String armas, String poderes) {
        super(armas, poderes);
    }

    public void furiaVenenosa(Personagem alvo) {
        System.out.println("Feiticeiro usou Chapéu: Fúria Venenosa em " + alvo.getNome());
        alvo.setVida(alvo.getVida() - 50);
    }

    public void furiaVenenosa(Personagem alvo) {
        System.out.println("Feiticeiro usou Cajado: Evocação do Fogo em " + alvo.getNome());
        alvo.setVida(alvo.getVida() - 100);
    }

    public void furiaVenenosa(Personagem alvo) {
        System.out.println("Feiticeiro usou Cajado: Tempestade de Raios em " + alvo.getNome());
        alvo.setVida(alvo.getVida() - 150);
    }

    public void descricao() {
        System.out.println("\nDescrição do Personagem\n");
        System.out.println("Nome: Feiticeiro");
        System.out.println("Vida: 500");
        System.out.println("Arma: Cajado, Chapéu");
        System.out.println("Poderes: Cajado: Evocação do Fogo, Tempestade de Raios; Chapéu: Fúria Venenosa");
        System.out.println("Descrição: Vestindo um manto sombrio adornado com runas enigmáticas, ele carrega um cajado feito da madeira de árvores amaldiçoadas, cujo fulgor sinistro reflete o poder corruptor que ele domina.");
  }
   
}
