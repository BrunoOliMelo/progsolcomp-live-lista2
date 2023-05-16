/* Nome do Aluno: Bruno Oliveria Melo
* RA: 12723111120
* Nome do Programa: Faça um programa que preencha com zeros todas as posições 
de um vetor de tamanho 50
* Data: 12/04/2023
*/

public class Lista02_Atividade14 {
    public static void main(String[] args) {
        int[] vetor = new int[50];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 0;
        }

        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
