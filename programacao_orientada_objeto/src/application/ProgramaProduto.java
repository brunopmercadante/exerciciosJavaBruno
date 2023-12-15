package application;
import java.util.Scanner;
import entities.Product;
public class ProgramaProduto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = teclado.nextLine();
        System.out.print("Price ");
        product.price = teclado.nextDouble();
        System.out.print("Quantity ");
        product.quantity = teclado.nextInt();
        System.out.println(product.name + ";" + product.price + ":" + product.quantity);





        teclado.close();
    }

}
