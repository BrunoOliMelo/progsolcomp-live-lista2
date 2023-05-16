/* Nome do Aluno: Bruno Oliveria Melo
* RA: 12723111120
* Nome do Programa: Faça um programa que exiba todos os números pares a 
partir de 0 até que encontre um múltiplo de 7 (utilize 
do/while
* Data: 12/04/2023
*/

public class Lista02_Atividade12 {
    public static void main(String[] args) {
        int numero = 0;

        do {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero += 2;
        } while (numero % 7 != 0);
    }
}
