import java.util.Scanner;
public class ex2RaioCirculo {
    public static void main(String[] args) {
        //Faça um programa para ler o valor do raio de um círculo,
        // e depois mostrar o valor da área deste círculo com quatro
        //casas decimais conforme exemplos.
        //Fórmula da área: area = π . raio2
        //Considere o valor de π = 3.14159
        Scanner teclado = new Scanner(System.in);
        double raio, area;
        double pi = 3.14159;
        System.out.println("Digite o valor do raio");
        raio = teclado.nextDouble();
        area = pi * (raio * raio);
        System.out.printf("Se o valor do raio é %.2f, o valor da área é de %.4f%n", raio, area);



    }

}
