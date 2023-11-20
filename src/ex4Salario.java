import java.util.Locale;
import java.util.Scanner;
public class ex4Salario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        //Fazer um programa que leia o número de um funcionário,
        // seu número de horas trabalhadas, o valor que recebe por
        //hora e calcula o salário desse funcionário.
        // A seguir, mostre o número e o salário do funcionário, com duas casas
        //decimais.

        int numero,horasTrabalhadas;
        double salario, valorHora;

        numero = teclado.nextInt();
        horasTrabalhadas = teclado.nextInt();
        valorHora = teclado.nextDouble();

        salario = horasTrabalhadas*valorHora;
        System.out.printf(" O número do funcionário é %d e seu salário total é U$ %.2f", numero, salario );
   teclado.close();
    }
}
