import java.util.Locale;
import java.util.Scanner;

public class Main {
    /*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
    hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
    decimais*/

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);
        int number= sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorHorasTrabalhadas = sc.nextDouble();
        double salary =horasTrabalhadas*valorHorasTrabalhadas;
        System.out.println("NUMBER = "+number);
        System.out.printf("SALARY = $ %.2f",salary);

        sc.close();



    }
}
