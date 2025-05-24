package combate;

// Subclasse Mago
public class Mago extends Personagem {

    public Mago(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(nome + " (Mago) conjura uma bola de fogo arcana!");
        // Lógica de dano mágico, custo de mana, etc., específica do Mago
    }
}
