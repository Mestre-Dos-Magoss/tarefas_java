package br.com.tarefaJava;

public class HelloWorldJava {
    static void main(String[] args) {
        System.out.println("Hello World");
        String atributo = args[0];

        if (atributo.equalsIgnoreCase("DEV")){
            System.out.println("você digitou " + atributo);
        }
        else{
            System.out.println("Você digitou algo diferente de DEV '_' \n");
            System.out.println( "O que foi digitado: "+ atributo);
        }
    }
}
