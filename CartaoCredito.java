package pagamento;

// Subclasse CartaoCredito
public class CartaoCredito extends Pagamento {
    private static final double TAXA_PROCESSAMENTO = 0.05; // Taxa de 5%

    @Override
    public void processar(double valor) {
        double valorFinal = valor * (1 + TAXA_PROCESSAMENTO);
        System.out.printf("Processando pagamento de R$ %.2f com Cartão de Crédito. Taxa de %.1f%% aplicada. Valor final: R$ %.2f\n",
                          valor, TAXA_PROCESSAMENTO * 100, valorFinal);
        // Lógica adicional de processamento de cartão de crédito (ex: comunicação com gateway)
    }
}
