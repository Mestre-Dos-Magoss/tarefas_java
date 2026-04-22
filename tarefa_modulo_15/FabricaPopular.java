package tarefa_modulo_15;

class FabricaPopular implements IFabricaVeiculos {
    public ICarro criarCarro() {
        return new CarroPopular();
    }

    public IMotor criarMotor() {
        return new MotorPopular();
    }
}