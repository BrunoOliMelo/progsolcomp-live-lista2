/* Nome do Aluno: Bruno Oliveria Melo
* RA: 12723111120
* Nome do Programa: Faça um programa que some os números de 1 a 100 e imprima 
somente o valor total da soma (utilize while).
* Data: 12/04/2023
*/

public class Lista02_Atividade13 {
    public static void main(String[] args) {
        double numero = 1;
        double soma = 0;

        while(numero <= 100){
            soma += numero;
            numero++;
        }
        System.out.println(soma);
    }
}
