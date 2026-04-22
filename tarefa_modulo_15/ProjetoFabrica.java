package tarefa_modulo_15;

public class ProjetoFabrica {
    public static void main(String[] args) {
        IFabricaVeiculos fabrica = new FabricaLuxo();

        ICarro meuCarro = fabrica.criarCarro();
        IMotor meuMotor = fabrica.criarMotor();

        System.out.println("=== Iniciando Produção ===");
        meuCarro.exibirDetalhes();
        meuMotor.ligar();
    }
}
