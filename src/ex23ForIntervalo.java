import java.util.Scanner;

public class ex23ForIntervalo {
    public static void main(String[] args) {
            //Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos
            // em seguida.Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos
            // estão fora do intervalo, mostrandoessas informações conforme exemplo (use a palavra
            // "in" para dentro do intervalo, e "out" para fora do intervalo).
                Scanner teclado = new Scanner(System.in);
                System.out.println("Digite o valor de x:");
                int x = teclado.nextInt();
                for (int i = 1; i <= x; i++) {
                    if (x>10 && x<20){
                        System.out.println();
                    }
                }
                teclado.close();
            }

        }

