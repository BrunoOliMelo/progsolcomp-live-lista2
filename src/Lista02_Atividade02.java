/* Nome do Aluno: Bruno Oliveria Melo
* RA: 12723111120
* Nome do Programa: Construa um programa que receba como entrada três valores A, B 
e C e os imprima em ordem crescente.
* Data: 12/04/2023
*/

import java.util.Scanner;

public class Lista02_Atividade02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva 3 valores:");
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        
        sc.close();

        if(A <= B && A <= C){
            if(B <= C){
                System.out.println(A + ", " + B + ", " + C);
            } else {
                System.out.println(A + ", " + C + ", " + B);
            }
        } else if(B <= A && B <= C){
            if(A <= C){
                System.out.println(B + ", " + A + ", " + C);
            } else {
                System.out.println(B + ", " + C + ", " + A);
            }
        } else {
            if(A <= B){
                System.out.println(C + ", " + A + ", " + B);
            } else {
                System.out.println(C + ", " + B + ", " + A);
            }
        }
    }
}

