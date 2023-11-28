import java.util.Scanner;
public class ex8FormulaBhaskara {
    //Leia 3 valores de ponto flutuante e efetue o cálculo das
    // raízes da equação deBhaskara.
    // Se não for possível calcular as raízes, mostre a mensagem
    // correspondente “Impossivel calcular”,
    // caso haja uma divisão por 0 ou raiz de numero negativo.
    // fórmula de báscara =  "(-b±√(b²-4ac))/(2a)"

    public static void main(String[] args) {
    double a,b,c,delta,x1,x2;
    Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de a");
        a = teclado.nextDouble();
        System.out.println("Digite o valor de b");
        b = teclado.nextDouble();
        System.out.println("Digite o valor de c");
        c = teclado.nextDouble();
        delta = (b*b) - 4*a*c;
        if (a == 0 || delta < 0.0){
            System.out.println("Impossivel calcular");
        }
        else {
            x1 = (-b + Math.sqrt(delta))/(2 * a);
            x2 = (-b - Math.sqrt(delta))/(2 * a);
            System.out.printf("O valor de x1 é de %.5f%n", x1);
            System.out.printf("O valor de x2 é de %.5f%n ", x2);
        }
        teclado.close();
    }
}
