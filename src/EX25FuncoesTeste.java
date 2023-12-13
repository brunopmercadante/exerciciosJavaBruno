import java.util.Scanner;
public class EX25FuncoesTeste {
        public static void main(String[] args) {
        /*
        Fazer um programa para ler três números inteiros e mostrar na tela o maior deles.
         */
            Scanner teclado = new Scanner(System.in);
            System.out.println("Type in the value of a:");
            int a = teclado.nextInt();
            System.out.println("Type in the value of b:");
            int b = teclado.nextInt();
            System.out.println("Type in the value of c:");
            int c = teclado.nextInt();
            int higher = max(a,b,c);
            showResult(higher);
                teclado.close();
            }
            public static int max(int x, int y, int z){
            int aux;
            if (x>y && x>z){
                aux = x;
            } else if (y>z) {
                    aux = y;
                }
                else{
                    aux = z;
                }
                return aux;
            }
            public static void showResult (int value){
                System.out.println("Higher = " + value);
        }
    }