package tarefa_mod_17;

import java.util.ArrayList;
import java.util.List;

public class GaragemGenerica<T extends Veiculo> {
    private List<T> lista = new ArrayList<>();

    public void adicionar(T veiculo) {
        lista.add(veiculo);
    }

    public void mostrarTodos() {
        for (T v : lista) {
            System.out.print("Modelo: " + v.getModelo() + " -> ");
            v.acelerar();
        }
    }
}