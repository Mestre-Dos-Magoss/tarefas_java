package tarefa_mod_23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Test;
import tarefa_mod_22.CadastroSimples;

import java.util.*;

public class CadastroSimplesTest {

    @Test
    public void deveGarantirQueExistemApenasMulheresNaLista() {
        // 1. Criamos os dados para o teste
        Map<String, List<String>> mapaPessoas = new HashMap<>();
        mapaPessoas.put("M", Arrays.asList("João", "Pedro"));
        mapaPessoas.put("F", Arrays.asList("Maria", "Ana"));

        // 2. CHAMAMOS o método da classe que já existe
        // Note que usamos o nome da Classe . nome do Método
        List<String> resultado = CadastroSimples.filtrarMulheres(mapaPessoas);

        // 3. Verificamos se funcionou
        Assert.assertEquals(2, resultado.size());
        Assert.assertTrue(resultado.contains("Maria"));
        Assert.assertFalse(resultado.contains("João"));
    }
}