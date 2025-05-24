package pagamento;

// Subclasse Boleto
public class Boleto extends Pagamento {
    private static final double TAXA_FIXA = 2.50; // Taxa fixa de R$ 2,50

    @Override
    public void processar(double valor) {
        double valorFinal = valor + TAXA_FIXA;
        System.out.printf("Processando pagamento de R$ %.2f com Boleto. Taxa fixa de R$ %.2f aplicada. Valor final: R$ %.2f\n",
                          valor, TAXA_FIXA, valorFinal);
        // Lógica adicional de geração e registro de boleto
    }
}
