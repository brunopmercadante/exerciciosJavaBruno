import java.util.Scanner;
public class ex19For {
    public static void main(String[] args) {
        //Fazer um programa que lê um valor inteiro N e depois N números inteiros.
        //Ao final, mostra a soma dos N números lidos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de n");
        int n = teclado.nextInt();
        int soma = 0;
        for (int i = 0; i<n; i++){
            int x = teclado.nextInt();
            soma = soma + x;
        }
        System.out.println("O valor da soma é " + soma);
        teclado.close();
    }
}
