package tarefa_mod_19;

@Tabela("Carros_Esportivos")
public class Esportivo implements IVeiculo {

    @Override
    public void acelerar() {
        System.out.println("O esportivo está acelerando...");
    }
}