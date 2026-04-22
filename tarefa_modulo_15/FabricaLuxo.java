package tarefa_modulo_15;

class FabricaLuxo implements IFabricaVeiculos {
    public ICarro criarCarro() {
        return new CarroLuxo();
    }

    public IMotor criarMotor() {
        return new MotorLuxo();
    }
}