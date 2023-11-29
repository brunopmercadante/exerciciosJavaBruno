import java.util.Scanner;
public class ex02CalculadoraSoma {
    public static void main(String[] args) {
        int a,b,c;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 3 números");
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        System.out.println("você digitou os números " + a + ", " + b + " e " + c );
        System.out.println("A soma dos números é " + (a+b+c));
    }
}
