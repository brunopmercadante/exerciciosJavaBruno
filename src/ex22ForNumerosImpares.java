import java.util.Scanner;
public class ex22ForNumerosImpares {
    public static void main(String[] args) {
        //Leia um valor inteiro X (1 <= X <= 1000).
        // Em seguida mostre os ímpares de 1 até X, um valor por linha,
        // inclusive o X, se for o caso
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de x:");
        int x = teclado.nextInt();
            for (int i = 1; i <= x; i++) {
                if (i % 2 !=0){
                    System.out.println(i);
            }
        }
            teclado.close();
    }

}
