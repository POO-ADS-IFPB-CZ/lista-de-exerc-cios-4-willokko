package pagamento;

// Subclasse Pix
public class Pix extends Pagamento {
    private static final double DESCONTO = 0.02; // Desconto de 2%

    @Override
    public void processar(double valor) {
        double valorFinal = valor * (1 - DESCONTO);
        System.out.printf("Processando pagamento de R$ %.2f com Pix. Desconto de %.1f%% aplicado. Valor final: R$ %.2f\n",
                          valor, DESCONTO * 100, valorFinal);
        // Lógica adicional de processamento Pix (ex: geração de QR Code)
    }
}
