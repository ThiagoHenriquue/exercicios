package org.example;

public class Operadores {

    public static void main(String args[]){
        operadoresAritimeticas();
        operacoesAtribuicoes();
        operacoesIncrementoDecremento();
        operacoesRelacionais();
        operacoeslogicas();


    }

    private static void operacoeslogicas() {
        System.out.println("**** operacoesLogicas ****");

        int num1 = 10;
        int num2 = 10;
        
        //operacao logica
        boolean isDentro10 = num1 >= 1 && num1 <= 10;
        System.out.println("isDentro10: " + isDentro10);

        //operacao logica
        boolean isDentro_10 = num1 >= 1 || num1 <= 10;
        System.out.println("isDentro_10: " + isDentro_10);

        //operacao logica
        boolean isDentro__10 = num1 >= 1 ;
        System.out.println("isDentro__10: " + !isDentro__10);

    }

    private static void operacoesRelacionais() {
        System.out.println("**** operacoesRelacionais ****");
        int num1 = 10;
        int num2 = 10;
        boolean isMaior = num1 > num2;
        System.out.println("insMaior: " + isMaior);

        boolean isIgual = num1 == num2;
        System.out.println("isIgual: " + isIgual);

        boolean isMaiorIgual = num1 >= num2;
        System.out.println("isMaiorIgual: " + isMaiorIgual);

        boolean isMenorIgual = num1 <= num2;
        System.out.println("isMenorIgual: " + isMenorIgual);

        boolean isMenor = num1 < num2;
        System.out.println("isMenor: " + isMenor);

        boolean isDiferente = num1 != num2;
        System.out.println("isDiferente: " + isDiferente);



    }

    private static void operacoesIncrementoDecremento() {
        System.out.println("**** operacoesIncrementoDecremento ****");

        int num1 = 10;
        System.out.println(num1);
        num1++;
        System.out.println(num1);
        num1--;
        System.out.println(num1);



    }


    private static void operacoesAtribuicoes() {
        System.out.println("**** operacoesAtribuicoes ****");
        int numero1 = 10;
        int numero2 = 10;
        int numero3 = numero1 + numero2;
        System.out.println(numero3);
        numero3 += numero3;
        int numero4 = numero3 + 20;
        System.out.println(numero3);
        System.out.println(numero4);
    }

    public static void operadoresAritimeticas(){
        System.out.println("**** operacoesAritimeticas ****");
        int num1 =10;
        int num2 = 20;

        int num3 = num1 + num2;
        int num4 = num1 - num2;
        int num5 = num1 / num2;
        int num6 = num1 * num2;
        int num7 = (10 * 10)/2;

        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
    }
}
