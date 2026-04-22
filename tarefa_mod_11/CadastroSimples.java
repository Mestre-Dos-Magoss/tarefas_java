package tarefa_mod_11;
import java.util.*;

public class CadastroSimples {
    public static void main(String[] args) {
        Map<String, List<String>> mapaPessoas = new HashMap<>();
        mapaPessoas.put("M", new ArrayList<>());
        mapaPessoas.put("F", new ArrayList<>());

        Scanner teclado = new Scanner(System.in);
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Digite o nome da pessoa: ");
            String nome = teclado.nextLine();

            System.out.print("Digite o sexo (M/F): ");
            String sexo = teclado.nextLine().toUpperCase();

            if (sexo.equalsIgnoreCase("M")) {
                mapaPessoas.get("M").add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                mapaPessoas.get("F").add(nome);
            } else {
                System.out.println("Sexo inválido! Use M ou F.");
            }

            System.out.println("\n--- Lista de Pessoas Atualizada ---");
            System.out.println("Homens: " + mapaPessoas.get("M"));
            System.out.println("Mulheres: " + mapaPessoas.get("F"));
            System.out.println("-----------------------------------\n");

            System.out.print("Deseja adicionar mais alguém? (s/n): ");
            continuar = teclado.nextLine();
        }

        System.out.println("Programa encerrado.");
    }
}
