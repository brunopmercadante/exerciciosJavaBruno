import java.util.Locale;
import java.util.Scanner;

public class ex01AreaTerreno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
    double largura, comprimento, metroQuadrado;
    System.out.println("Digite o valor da largura do terreno");
    largura = teclado.nextDouble();
    System.out.println("Digite o valor do comprimento do terreno");
    comprimento = teclado.nextDouble();
    System.out.println("Digite o valor do custo do metro quadrado do terreno");
    metroQuadrado = teclado.nextDouble();

       double area = largura * comprimento;
        System.out.printf("O valor da área é de  %.2f metros quadrados\n", area);
        double valorTotal = area * metroQuadrado;
        System.out.printf("O valor do terreno é de %.2f reais", valorTotal);
teclado.close();
    }
}
