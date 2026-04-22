package tarefa_mod_13;

public abstract class Pessoa {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void falarNome();
}
