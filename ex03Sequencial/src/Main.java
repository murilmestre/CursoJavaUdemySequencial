import java.util.Scanner;

public class Main {
     /*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int DIFERNCA = (A * B - C * D);
        System.out.println("DIFERENCA = "+DIFERNCA);
        sc.close();

    }
}
