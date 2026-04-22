package tarefa_mod_17;

   public abstract class Veiculo {
        private String modelo;

        public Veiculo(String modelo) {
            this.modelo = modelo;
        }

        public String getModelo() {
            return modelo;
        }

        // Método abstrato: cada carro dirá como acelera
        public abstract void acelerar();
    }
