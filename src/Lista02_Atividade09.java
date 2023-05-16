/* Nome do Aluno: Bruno Oliveria Melo
* RA: 12723111120
* Nome do Programa: Faça um programa que receba o valor da venda, escolha a 
condição de pagamento no menu e mostre o total da venda final
* Data: 12/04/2023
*/

import java.util.Scanner;

public class Lista02_Atividade09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor da venda:");
        double valorVenda = sc.nextDouble();

        System.out.println("Esolha uma forma de pagamento entre 1 e 6");
        int opcao = sc.nextInt();
        double valorfinal;

        switch(opcao){
            case 1: 
            System.out.println("Venda a Vista - desconto de 10%");
            valorfinal = valorVenda - (valorVenda * 0.1);
            System.out.println("Valor com desconto: R$" + valorfinal);
            break;
            case 2:
            System.out.println("Venda a Prazo 30 dias - desconto de 5%");
            valorfinal = valorVenda - (valorVenda * 0.05);
            System.out.println("Valor com desconto: R$" + valorfinal);
            break;
            case 3:
            System.out.println("Venda a Prazo 60 dias - sem desconto");
            System.out.println("Valor final: R$ " + valorVenda);
            break;
            case 4:
            System.out.println("Venda a Prazo 90 dias - acréscimo de 5%");
            valorfinal =  valorVenda + (valorVenda * 0.05);
            System.out.println("Valor final: R$ " + valorfinal);
            break;
            case 5: 
            System.out.println("Venda no cartão de débito - desconto de 8%");
            valorfinal = valorVenda - (valorVenda * 0.08);
            System.out.println("Valor com desconto: R$" + valorfinal);
            break;
            case 6:
            System.out.println("Venda com cartão de crédito - desconto de 7%");
            valorfinal = valorVenda - (valorVenda * 0.07);
            System.out.println("Valor com desconto: R$" + valorfinal);
            break;
        }
        sc.close();
    }
}
