import java.util.Scanner;
public class Ex25Funcoes {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler três números inteiros e mostrar na tela o maior deles.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Type in the value of a:");
    int a = teclado.nextInt();
        System.out.println("Type in the value of b:");
    int b = teclado.nextInt();
        System.out.println("Type in the value of c:");
    int c = teclado.nextInt();
    if (a>b && a>c) {
        System.out.println("The higher number is " + a);
    }
        else if (b>c) {
            System.out.println("The higher number is " + b);
        }
        else{
            System.out.println("The higher number is " + c);
        teclado.close();
    }

    }
}
