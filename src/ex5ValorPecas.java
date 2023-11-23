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
        System.out.println("Digite o código da peça tipo 1:");
        codigo1 = teclado.nextInt();
        System.out.println("Digite o número de peças tipo 1: ");
        numero1 = teclado.nextInt();
        System.out.println("Digite o valor de cada peça tipo 1:");
        valor1 = teclado.nextDouble();
        System.out.println("Digite o código da peça tipo 2:");
        codigo2 = teclado.nextInt();
        System.out.println("Digite o número de peças tipo 2:");
        numero2 = teclado.nextInt();
        System.out.println("Digite o valor de cada peça tipo 2:");
        valor2 = teclado.nextDouble();
        total = valor1*numero1 + valor2 * numero2;
        System.out.printf("O valor total a pagar é de R$ %.2f",total);
teclado.close();
    }
}
