package combate;

// Subclasse Arqueiro
public class Arqueiro extends Personagem {

    public Arqueiro(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(nome + " (Arqueiro) dispara uma flecha precisa contra o alvo!");
        // Lógica de dano à distância, chance de crítico, etc., específica do Arqueiro
    }
}
