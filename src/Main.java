import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     int codigo, quantidade;

        System.out.println("Digite o código do produto");
        codigo = teclado.nextInt();
        System.out.println("Digite a quantidade de produtos");
        quantidade = teclado.nextInt();
        double valorTotal;
valorTotal = codigo * quantidade;
     if (codigo == 1){
         valorTotal = quantidade*4;
     }
    else if (codigo == 2){
         valorTotal = quantidade*4.50;
     }
    else if (codigo == 3){
         valorTotal = quantidade*5.0;
     }
    else if (codigo == 4){
         valorTotal = quantidade*2.0;
     }
    else if (codigo == 5){
         valorTotal = quantidade * 1.50;
     }
        System.out.printf("O valor total é de R$ %.2f" + valorTotal);
    }
}