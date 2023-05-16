/* Nome do Aluno: Bruno Oliveria Melo
* RA: 12723111120
* Nome do Programa: Escreva um programa que, dada a carga máxima de um 
elevador e a quantidade máxima de pessoas digitadas pelo 
usuário, leia o peso de cada pessoa, também digitada pelo 
usuário, que entra no elevador até que a carga máxima seja 
atingida ou o número máximo de pessoas seja atingido (utilize 
do /while).
* Data: 12/04/2023
*/
import java.util.Scanner;

public class Lista02_Atividade20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a carga máxima do elevador em quilogramas: ");
        int cargaMaxima = scanner.nextInt();

        System.out.print("Digite a quantidade máxima de pessoas no elevador: ");
        int quantidadeMaximaPessoas = scanner.nextInt();

        int pesoAtual = 0;
        int pessoasNoElevador = 0;

        do {
            System.out.print("Digite o peso da pessoa em quilogramas: ");
            int pesoPessoa = scanner.nextInt();

            if (pesoAtual + pesoPessoa <= cargaMaxima && pessoasNoElevador < quantidadeMaximaPessoas) {
                pesoAtual += pesoPessoa;
                pessoasNoElevador++;
            } else {
                System.out.println("Limite de carga máxima ou quantidade máxima de pessoas atingido.");
                break;
            }
        } while (true);

        System.out.println("Peso total no elevador: " + pesoAtual + " kg");
        System.out.println("Quantidade de pessoas no elevador: " + pessoasNoElevador);

        scanner.close();
    }
}
