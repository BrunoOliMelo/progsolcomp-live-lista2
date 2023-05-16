/* Nome do Aluno: Bruno Oliveria Melo
* RA: 12723111120
* Nome do Programa: Faça um programa para imprimir o conceito de um aluno. O 
conceito é calculado em função da nota do aluno que varia de 0 
a 100.
* Data: 12/04/2023
*/

import java.util.Scanner;

public class Lista02_Atividade06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva a sua nota:");
        double nota = sc.nextDouble();
        sc.close();
        if(nota <= 49){
            System.out.println("Insuficiente.");
        } else if (nota <= 64){
            System.out.println("Regular.");
        }else if(nota <= 84){
            System.out.println("Bom.");
        }else if(nota <= 100){
            System.out.println("Ótimo.");}
    }
    
}
