package tarefa_mod_10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Aluno aluno = new Aluno("João");
        double mediaFInal = inserirNotas();
        aluno.verificaAlunoFoiAprovado(mediaFInal);
}

    public static double inserirNotas() {
        int contador = 0;
        double media = 0;

        System.out.println("===== Seja bem-vindo aluno ======");
        Scanner scanner = new Scanner(System.in);

        while(contador < 4){
            System.out.println("Insira a sua nota:");
            double nota = scanner.nextDouble();

            media+= nota;
            contador = contador+1;
        }
        media = media/4;
        return media;
        }
    }
