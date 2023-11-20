import java.util.Scanner;

public class ex3Diferenca {
    public static void main(String[] args) {
        //Fazer um programa para ler quatro valores inteiros A, B, C e D.
        // A seguir, calcule e mostre a diferença do produto
        //de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
        Scanner teclado = new Scanner(System.in);
        int a,b,c,d, diferenca;
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();
diferenca = (a*b - c*d);
        System.out.println("Diferença é igual a " + diferenca);
teclado.close();
    }
}
