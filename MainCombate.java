package combate;

import java.util.ArrayList;
import java.util.List;

// Classe principal para simular um turno de combate polimórfico
public class MainCombate {

    public static void main(String[] args) {
        // Cria uma lista para armazenar os personagens no combate
        List<Personagem> personagens = new ArrayList<>();

        // Adiciona instâncias das subclasses à lista
        personagens.add(new Guerreiro("Aragorn"));
        personagens.add(new Mago("Gandalf"));
        personagens.add(new Arqueiro("Legolas"));
        personagens.add(new Guerreiro("Gimli")); // Outro guerreiro para variedade

        System.out.println("--- Início do Turno de Combate ---");

        // Itera sobre a lista e faz cada personagem atacar usando polimorfismo
        // A JVM decide em tempo de execução qual método atacar() chamar
        for (Personagem p : personagens) {
            p.atacar();
        }

        System.out.println("--- Fim do Turno de Combate ---");
    }
}
