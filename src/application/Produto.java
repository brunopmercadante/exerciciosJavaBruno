package application;

import java.util.Scanner;
import entities.Product;
public class Produto {
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

        System.out.println(product.name + ", " + product.price + ", " + product.quantity);
        System.out.println();

        System.out.println("Product data: " + product);
        System.out.println();
        
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = teclado.nextInt();
        product.AddProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = teclado.nextInt();
        product.RemoveProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);
        teclado.close();
    }
    }

