/* Nome do Aluno: Bruno Oliveria Melo
* RA: 12723111120
* Nome do Programa: Faça um programa que solicite ao usuário que digite um 
número até que ele digite um número menor que 0 (utilize 
while
* Data: 12/04/2023
*/

import java.util.Scanner;
public class Lista02_Atividade16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número (digite um número negativo para sair): ");
            numero = scanner.nextInt();
        } while (numero >= 0);

        System.out.println("Número digitado menor que 0. O programa foi encerrado.");

        scanner.close();
    }
}
