import java.util.Scanner;
public class ex15ImpostoRenda {
    public static void main(String[] args) {
        // Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa
        // Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda,
        // segundo a tabela abaixo:
        // Até  R$ 2.000,00 - ISENTO
        // De R$ 2.000,01 à R$ 3.000,00 - 8% de incidência
        // De R$ 3.000,01 à R$ 4.500,00 - 18% de incidência
        // Acima de R$ 4.500,00 - 28% de incidência
        Scanner teclado = new Scanner(System.in);
        double salarioBruto, impostoRenda;
        salarioBruto = 0;
        System.out.println("Insira o valor bruto do salário");
        salarioBruto = teclado.nextDouble();
        if (salarioBruto <= 2000.0) {
            impostoRenda = 0;
        } else if (salarioBruto <= 3000.0) {
            impostoRenda = (salarioBruto - 2000.0) * 0.08;
        } else if (salarioBruto <= 4500.0) {
            impostoRenda = (salarioBruto - 3000.0) * 0.18 + (1000.0 * 0.08);
        }
        else {
            impostoRenda = (salarioBruto - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }
        if (impostoRenda == 0){
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", impostoRenda);
        }
        }
    }
