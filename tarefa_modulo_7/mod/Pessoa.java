package tarefa.mod;

public class Pessoa {
    private String nome;
    private String idade;
    protected String cpf;

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void apresentarse(){
        System.out.println("Olá, muito prazer, eu sou o " + getNome());
    }

    public void minhaIdade(){
        System.out.println("Atualmente eu estou com "+getIdade()+" anos de idade.");
    }

    public void cpf(){
        System.out.println("Meu cpf é: "+ getCpf());
    }
}
