package tarefa_mod_19;

public class TesteReflection {
    public static void main(String[] args) {

        Class<Esportivo> classeEsportivo = Esportivo.class;

        if (classeEsportivo.isAnnotationPresent(Tabela.class)) {

            Tabela anotacao = classeEsportivo.getAnnotation(Tabela.class);

            System.out.println("Nome da tabela encontrado: " + anotacao.value());

        } else {
            System.out.println("Erro: A anotação @Tabela não foi encontrada.");
            System.out.println("Dica: Verifique se o @Retention(RetentionPolicy.RUNTIME) está no arquivo Tabela.java");
        }
    }
}