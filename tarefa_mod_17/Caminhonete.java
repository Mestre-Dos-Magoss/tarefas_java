package tarefa_mod_17;

public class Caminhonete extends Veiculo {
    public Caminhonete(String modelo) { super(modelo); }

    @Override
    public void acelerar() {
        System.out.println(getModelo() + " acelerou com muita força e carga!");
    }
}