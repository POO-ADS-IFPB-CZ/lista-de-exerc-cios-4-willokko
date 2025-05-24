package pagamento;

import java.util.ArrayList;
import java.util.List;

// Classe principal para demonstrar o polimorfismo com Pagamento
public class MainPagamento {

    public static void main(String[] args) {
        // Cria uma lista para armazenar diferentes formas de pagamento
        List<Pagamento> formasDePagamento = new ArrayList<>();

        // Adiciona instâncias das subclasses à lista
        formasDePagamento.add(new CartaoCredito());
        formasDePagamento.add(new Boleto());
        formasDePagamento.add(new Pix());

        // Define um valor de exemplo para o pagamento
        double valorCompra = 100.00;

        System.out.println("--- Processando Pagamentos (Valor: R$ " + String.format("%.2f", valorCompra) + ") ---");

        // Itera sobre a lista e processa cada pagamento usando polimorfismo
        // A JVM decide em tempo de execução qual método processar() chamar
        for (Pagamento pagamento : formasDePagamento) {
            pagamento.processar(valorCompra);
        }

        System.out.println("\n--- Processando outro valor --- ");
        double outraCompra = 55.75;
        Pagamento pagamentoEspecifico = new CartaoCredito(); // Exemplo com tipo específico
        pagamentoEspecifico.processar(outraCompra);

    }
}
