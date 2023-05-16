/* Nome do Aluno: Bruno Oliveria Melo
* RA: 12723111120
* Nome do Programa:  Faça um programa que leia dois números A e B e imprima o maior 
deles.
* Data: 12/04/2023
*/

import java.util.Scanner;

public class Lista02_Atividade01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.println("Escreva dois números pra saber qual é o maior.");
        System.out.println("Escreva o primeiro número:");
        a = sc.nextDouble();
        System.out.println("Escreva o segundo número:");
        b = sc.nextDouble();
        
        sc.close();

        if(a > b){
            System.out.println("o maior número é: " + a);
        }else{
            System.out.println("o maior número é: " + b);
        }
    }
}
