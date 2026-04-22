package tarefa_mod_17;

public class FabricaDeCarros {
    public static void main(String[] args) {
        GaragemGenerica<Veiculo> minhaGaragem = new GaragemGenerica<>();

        minhaGaragem.adicionar(new Esportivo("Ferrari"));
        minhaGaragem.adicionar(new Caminhonete("Hilux"));
        minhaGaragem.adicionar(new Esportivo("Porsche"));

        System.out.println("=== Veículos na Garagem ===");
        minhaGaragem.mostrarTodos();
    }
}
