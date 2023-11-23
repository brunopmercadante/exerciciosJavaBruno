import java.util.Scanner;
public class exScanner {
    public static void main(String[] args) {
        int x;
        String a,b,c;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de x:");
        x = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Digite o valor de a:");
        a = teclado.nextLine();
        System.out.println("Digite o valor de b:");
        b = teclado.nextLine();
        System.out.println("Digite o valor de c:");
        c = teclado.nextLine();
        System.out.println("você digitou os nomes " + a + ", " + b + " e " + c );

    }
}
