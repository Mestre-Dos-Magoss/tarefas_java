package tarefa_mod8;

public class Aluno {
    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;
    private String name;

    public Aluno( int nota1, int nota2, int nota3, int nota4, String name){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.name = name;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getNota4() {
        return nota4;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void alunoAprovado(){
        int resultado = (getNota1()+ getNota2()+ getNota3()+ getNota4()) / 4;

        if( resultado >= 7){
            System.out.println("Parabéns! você foi aprovado\n"+ getName());
            System.out.println("*** Média ***\n"+ resultado);
        }
        else {
            System.out.println("Se esforce mais da próxima vez "+getName());
            System.out.println("*** Média ***\n"+ resultado);
        }
    }
}
