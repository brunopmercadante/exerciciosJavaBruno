import java.util.Scanner;
public class ex20ForTabuada {
    public static void main(String[] args) {
        // Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:
        //1 x N = N      2 x N = 2N ... 10 x N = 10N
        //Entrada - A entrada contém um valor inteiro N (2 < N < 1000).
        //Saída - Imprima a tabuada de N, conforme o exemplo fornecido.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de N");
        int N = teclado.nextInt();
        if (N > 2 && N < 1000) {
            for (int i = 1; i <= 10; i++) {
                int tabuada = i * N;
                System.out.println(i + " x " + N + " = " + tabuada);
            }
        }
    }
}