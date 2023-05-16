/* Nome do Aluno: Bruno Oliveria Melo
* RA: 12723111120
* Nome do Programa: Faça um programa calcula o total de uma hospedagem em um 
hotel
* Data: 12/04/2023
*/

import java.util.Scanner;

public class Lista02_Atividade07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double diaria, valorTotal;

        System.out.println("Qunatos dias você se hospedou:");
        diaria = sc.nextDouble();
        sc.close();
        
        if (diaria > 15) {
            valorTotal = (diaria * 60) + (diaria * 5.50);
            System.out.printf("O valor final é: %.2f%n", valorTotal);
        }else if(diaria == 15){
            valorTotal = (diaria * 60) + (diaria * 6);
            System.out.printf("O valor final é: %.2f%n", valorTotal);
        }else if(diaria < 15){
            valorTotal = (diaria * 60) + (diaria * 8);
            System.out.printf("O valor final é: %.2f%n", valorTotal);    
        }
    }
}
