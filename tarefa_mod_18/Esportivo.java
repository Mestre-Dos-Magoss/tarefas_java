package tarefa_mod_18;

@Tabela("Carros_Esportivos")
public class Esportivo implements IVeiculo {
    private String modelo;

    public Esportivo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void acelerar() {
        System.out.println("O carro esportivo " + modelo + " está acelerando rápido!");
    }

    public String getModelo() {
        return modelo;
    }
}