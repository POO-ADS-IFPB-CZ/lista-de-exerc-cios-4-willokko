package pagamento;

// Classe abstrata Pagamento
public abstract class Pagamento {
    // Método abstrato que deve ser implementado pelas subclasses
    public abstract void processar(double valor);
}
