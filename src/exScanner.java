import java.util.Scanner;
public class exScanner {
    public static void main(String[] args) {
        int x;
        String a,b,c;

        Scanner teclado = new Scanner(System.in);
        x = teclado.nextInt();
        teclado.nextLine();
        a = teclado.nextLine();
        b = teclado.nextLine();
        c = teclado.nextLine();
        System.out.println("você digitou os nomes " + a + ", " + b + " e " + c );

    }
}
