package tarefa_mod_22;

import java.util.*;
import java.util.stream.Collectors;

public class CadastroSimples {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Map<String, List<String>> mapaPessoas = new HashMap<>();
        mapaPessoas.put("M", new ArrayList<>());
        mapaPessoas.put("F", new ArrayList<>());

        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.println("Digite o nome:");
            String nome = teclado.nextLine();

            System.out.println("Digite o sexo (M/F):");
            String sexo = teclado.nextLine().toUpperCase();

            if (sexo.equals("M")) {
                mapaPessoas.get("M").add(nome);
            } else if (sexo.equals("F")) {
                mapaPessoas.get("F").add(nome);
            }

            System.out.println("\n--- Pessoas Cadastradas até agora ---");
            System.out.println("Homens: " + mapaPessoas.get("M"));
            System.out.println("Mulheres: " + mapaPessoas.get("F"));

            System.out.println("\nDeseja adicionar mais alguém? (s/n)");
            continuar = teclado.nextLine();
        }

        List<String> listaMulheres = mapaPessoas.get("F").stream()
                .filter(nome -> !nome.isEmpty())
                .collect(Collectors.toList());

        System.out.println("\n=== Apenas Mulheres ===");
        listaMulheres.forEach(m -> System.out.println("Nome: " + m));

        System.out.println("\nFim do programa!");
    }
}