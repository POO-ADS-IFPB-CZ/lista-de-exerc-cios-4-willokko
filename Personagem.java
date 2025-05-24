package combate;

// Classe abstrata Personagem
public abstract class Personagem {
    protected String nome;

    public Personagem(String nome) {
        this.nome = nome;
    }

    // Método abstrato que deve ser implementado pelas subclasses
    public abstract void atacar();

    public String getNome() {
        return nome;
    }
}
