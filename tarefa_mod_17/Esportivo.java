package tarefa_mod_17;

class Esportivo extends Veiculo {
    public Esportivo(String modelo) { super(modelo); }

    @Override
    public void acelerar() {
        System.out.println(getModelo() + " voou de 0 a 100km/h!");
    }
}