/* Nome do Aluno: Bruno Oliveria Melo
* RA: 12723111120
* Nome do Programa: Elabore um programa que lê dois valores A e B e os escreve com 
a mensagem: “São múltiplos” ou “Não são múltiplos”.
* Data: 12/04/2023
*/

import java.util.Scanner;

public class Lista02_Atividade03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva dois números:");
        double A = sc.nextDouble();
        double B = sc.nextDouble();

        if (A % B == 0 || B % A == 0){
            System.out.println("São múltiplos.");
        }else{
            System.out.println("Não são múltiplos.");
        }   
        sc.close();     
    } 
}
