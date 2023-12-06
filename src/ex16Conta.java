import java.util.Scanner;
public class ex16Conta {
    public static void main(String[] args) {
        //Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
        //dá direito a 100 minutos de telefone. Cada minuto que exceder a
        //franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
        //quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
        //a ser pago
        Scanner teclado = new Scanner(System.in);
        double conta,minutosTotais;
        System.out.println("Insira quantos minutos totais foram utilizados no mês");
        minutosTotais = teclado.nextDouble();
        if (minutosTotais<=100){
            System.out.println("O valor da conta é de R$ 50,00");
        }
        else {
            conta = 50 + (minutosTotais -100)*2;
            System.out.println("O valor da conta é de R$ " + conta);
        }
        teclado.close();
    }
}
