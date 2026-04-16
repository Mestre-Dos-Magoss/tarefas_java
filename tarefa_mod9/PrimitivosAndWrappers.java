package tarefa_mod9;

public class PrimitivosAndWrappers {

    public static void main(String[] args){
        int numero1 = 1234;
        System.out.println("Número antes do Boxing "+numero1);
        Integer numero = numero1;
        System.out.println("Número após o Boxing "+ numero);

        //Unboxing
        Integer number1 = 23425;
        int number2 = Integer.valueOf(number1);
        System.out.println("Teste "+number2);



        //castring implicito
        int num1 = 12345;
        long num2 = num1;

        //casting expclicito
        System.out.println(num2);
        int num3 = (int) num2;

        System.out.println(num3); //ele apenas não reduziu o dado por ele ser ainda do tamanho de um int
                         // mas caso fosse maior o valor da variável, ela sofreria alterações
    }




}
