/* Nome do Aluno: Bruno Oliveria Melo
* RA: 12723111120
* Nome do Programa: Escreva um programa que, dado um número positivo digitado 
pelo o usuário mostre a tabuada de todos os números de 1 até o 
número digitado. (utilize for
* Data: 12/04/2023
*/

import java.util.Scanner;

public class Lista02_Atividade21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número positivo: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.println("Tabuada do " + i + ":");

            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }

            System.out.println(); // Adiciona uma linha em branco entre as tabuadas
        }

        scanner.close();
    }
}

