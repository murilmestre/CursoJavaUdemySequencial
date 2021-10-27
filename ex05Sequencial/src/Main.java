/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
*/


import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int peca1 = sc.nextInt();
        int qtdPeca1 = sc.nextInt();
        double valorPeca1 =sc.nextDouble();
        int peca2 =sc.nextInt();
        int qtdPeca2 = sc.nextInt();
        double valorPeca2 = sc.nextDouble();

        double valorTotal =(qtdPeca1*valorPeca1)+(qtdPeca2*valorPeca2);
        System.out.printf("VALOR A PAGAR = %.2f",valorTotal);
        sc.close();

    }
}
