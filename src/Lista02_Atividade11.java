/* Nome do Aluno: Bruno Oliveria Melo
* RA: 12723111120
* Nome do Programa: Faça um programa que imprima todos os números pares de 1 
a 100 na ordem inversa
* Data: 12/04/2023
*/

public class Lista02_Atividade11 {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
