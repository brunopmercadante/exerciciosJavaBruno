import java.util.Scanner;
public class ex1Soma {
    public static void main(String[] args) {
        //Faça um programa para ler dois valores inteiros,
        // e depois mostrar na tela a soma desses números com uma
        //mensagem explicativa, conforme exemplos.
        Scanner teclado = new Scanner(System.in);
        int valor1, valor2;
        System.out.println("Digite o primeiro valor");
        valor1 = teclado.nextInt();
        System.out.println("Digite o segundo valor");
        valor2 = teclado.nextInt();
        System.out.println("Você digitou os valores " + valor1 + " e " + valor2);
        int soma = valor1 + valor2;
        System.out.println("O valor da soma é de " + soma);


    }
}
