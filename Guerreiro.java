package combate;

// Subclasse Guerreiro
public class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(nome + " (Guerreiro) avança com sua espada e desfere um golpe poderoso!");
        // Lógica de dano, chance de acerto, etc., específica do Guerreiro
    }
}
