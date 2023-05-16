/* Nome do Aluno: Bruno Oliveria Melo
* RA: 12723111120
* Nome do Programa: Faça um programa que leia um número inteiro e mostre uma 
mensagem indicando se este número é par ou ímpar e se é 
positivo ou negativo.
* Data: 12/04/2023
*/


import java.util.Scanner;

public class Lista02_Atividade04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva um número inteiro.");
        int numero = sc.nextInt();

        sc.close();

        if(numero % 2 == 0){
            System.out.println("Par.");
        }else{
            System.out.println("Impar.");
        }
        if (numero >= 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo.");
        }
    }
}
