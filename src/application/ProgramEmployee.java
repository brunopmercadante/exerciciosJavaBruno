package application;
import java.util.Scanner;
import entities.Employee;
public class ProgramEmployee {
    /*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
    seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
    salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
    afetado pela porcentagem) e mostrar novamente os dados do funcionário.

     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.print("Name: ");
        emp.name = teclado.nextLine();
        System.out.print("Gross salary: ");
        emp.grossSalary = teclado.nextDouble();
        System.out.print("Tax: ");
        emp.tax = teclado.nextDouble();
        System.out.println();
        System.out.println("Employee: " + emp);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = teclado.nextDouble();
        emp.increaseSalary(percentage);
        System.out.println();
        System.out.println("Updated data: " + emp);
        teclado.close();
    }
}
