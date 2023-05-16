/* Nome do Aluno: Bruno Oliveria Melo
* RA: 12723111120
* Nome do Programa: Faça um programa que leia o nome, o sobrenome, a idade, em 
anos, e a naturalidade (cidade de nascimento) de uma pessoa.
Depois, o programa deve dar a seguinte opção “Deseja 
visualizar dados completos?”. Se o caractere digitado pelo 
usuário for ‘S’ o programa deve imprimir na tela Nome, 
Sobrenome, idade e naturalidade. Se o caractere digitado pelo 
usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se 
o caractere não for nenhuma das outras opções acima o programa 
deve imprimir “Digitação errada. Tente Novamente”.
* Data: 12/04/2023
*/


import java.util.Scanner;

public class Lista02_Atividade05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva seu nome:");
        String nome = sc.nextLine();

        System.out.println("Escreva seu sobrenome:");
        String sobrenome = sc.nextLine();

        System.out.println("Escreva sua idade:");
        double idade = sc.nextDouble();

        System.out.println("Escreva sua naturalidade:");
        String naturalidade = sc.nextLine();

        System.out.println("Deseja visualizar dados completos? (S/N)");
        char opcao = sc.nextLine().charAt(0);

        if (opcao == 'S' || opcao == 's'){
            System.out.println("Nome: " + nome + " " + sobrenome);
            System.out.println("Idade: " + idade);
            System.out.println("Naturalidade: " + naturalidade);
        } else if (opcao == 'N' || opcao == 'n') {
            System.out.println("Nome: " + nome + " " + sobrenome);
            System.out.println("Idade: " + idade);
        } else {
            System.out.println("Digitação errada. Tente Novamente.");
        }
        
        sc.close();
        
    }
}
