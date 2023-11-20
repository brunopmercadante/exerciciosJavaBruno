import java.util.Scanner;
public class ex5ValorPecas {
    public static void main(String[] args) {
        //Fazer um programa para ler o código de uma peça 1,
        // o número de peças 1, o valor unitário de cada peça 1,
        // o código de uma peça 2, o número de peças 2 e
        // o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
        Scanner teclado = new Scanner(System.in);
        int codigo1,codigo2,numero1,numero2;
        double valor1,valor2,total;
        codigo1 = teclado.nextInt();
        numero1 = teclado.nextInt();
        valor1 = teclado.nextDouble();
        codigo2 = teclado.nextInt();
        numero2 = teclado.nextInt();
        valor2 = teclado.nextDouble();
        total = valor1*numero1 + valor2 * numero2;
        System.out.printf("O valor total a pagar é de R$ %.2f",total);
teclado.close();
    }
}
