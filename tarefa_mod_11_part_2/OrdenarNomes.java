package tarefa_mod_11_part_2;

    import java.util.*;

    public class OrdenarNomes {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            System.out.println("Digite os nomes separados por vírgula (Ex: João, Maria, Ana):");
            String entrada = teclado.nextLine();

            String[] nomesArray = entrada.split(",");

            List<String> listaNomes = new ArrayList<>();

            for (String nome : nomesArray) {
                listaNomes.add(nome.trim());
            }

            Collections.sort(listaNomes);

            System.out.println("\nNomes em ordem alfabética:");
            System.out.println(listaNomes);

            teclado.close();
        }
    }

