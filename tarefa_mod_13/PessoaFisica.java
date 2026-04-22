package tarefa_mod_13;

public class PessoaFisica extends Pessoa{

    public PessoaFisica(String cfp) {
        this.cfp = cfp;
    }

    private String cfp;

    public String getCfp() {
        return cfp;
    }

    public void setCfp(String cfp) {
        this.cfp = cfp;
    }


    @Override
    public void falarNome() {
        System.out.println("Olá, eu me chamo "+this.getName()+" e sou uma pessoa física");
    }
}
