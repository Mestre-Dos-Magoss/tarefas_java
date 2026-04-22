package tarefa_mod_10;

public class Aluno {
    private String nome;

    public Aluno (String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void verificaAlunoFoiAprovado(double media){
        if(media >= 7) {
            System.out.println("O aluno " + getNome() + " foi aprovado, parabéns!\nMédia: " + media);
        } else if (media >= 6) {
            System.out.println("O aluno " + getNome() + " está de recuperação.\nMédia: " + media);
        } else {
            System.out.println("Aluno reprovado, você deve estudar mais na próxima.\nMédia: " + media);
        }
    }
}