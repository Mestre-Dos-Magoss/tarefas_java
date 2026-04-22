package tarefa_mod_13;

public class Main {
    public static void main(String[] args){
        PessoaFisica pessoaFisica = new PessoaFisica("12345");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("0001-000");
        pessoaFisica.setName("Joao");
        pessoaFisica.setCfp("12345");
        System.out.println("CPF do "+ pessoaFisica.getName()+" "+pessoaFisica.getCfp());
        pessoaFisica.falarNome();
        pessoaJuridica.setName("Carlos");
        pessoaJuridica.falarNome();
        pessoaJuridica.setCnpj("123");
        System.out.println("CNPJ do "+pessoaJuridica.getName()+" "+pessoaJuridica.getCnpj());
    }
}
