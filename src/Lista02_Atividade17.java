/* Nome do Aluno: Bruno Oliveria Melo
* RA: 12723111120
* Nome do Programa: Faça um programa que imprima os múltiplos negativos de 7, 
superiores a -1000. (utilize do / while)
* Data: 12/04/2023
*/

public class Lista02_Atividade17 {
    public static void main(String[] args) {
        int numero = -7;

        do {
            System.out.println(numero);
            numero -= 7;
        } while (numero > -1000);
    }
}
