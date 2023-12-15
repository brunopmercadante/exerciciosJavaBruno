package application;
import entities.Triangle;
import java.util.Scanner;
public class ProgramCorrigido {
    //Programa desenvolvido COMorientação à objetos
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // (Apagar essa parte e colocar as variáveis x e y)
        // double xA, xB, xC, yA, yB, yC;
        Triangle x,y;
        x = new Triangle();
        y = new Triangle();
        System.out.println("Enter the measures of triangle X: ");
        x.a = teclado.nextDouble();
        x.b = teclado.nextDouble();
        x.c = teclado.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = teclado.nextDouble();
        y.b = teclado.nextDouble();
        y.c = teclado.nextDouble();
        double areaX = x.area();
        double areaY = y.area();
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }
        teclado.close();
    }
}
