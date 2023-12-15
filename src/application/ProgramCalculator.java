package application;
import java.util.Scanner;
public class ProgramCalculator {
    public static final double PI = 3.14159;
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = teclado.nextDouble();
        double c = circumference(radius);
        double v = volume(radius);
        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", PI);
        teclado.close();
    }
    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }
    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
