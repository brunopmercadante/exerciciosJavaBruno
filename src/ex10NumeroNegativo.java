import java.util.Scanner;
public class ex10NumeroNegativo {
    public static void main(String[] args) {
        //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
        //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
        //Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        //Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
        //ordem crescente ou decrescente.
        Scanner teclado = new Scanner(System.in);
    int numero1,numero2,a,b;
        System.out.println("Digite um número positivo ou negativo");
        numero1 = teclado.nextInt();
        System.out.println("Digite um número par ou ímpar");
        numero2 = teclado.nextInt();
        System.out.println("Digite o valor de a");
        a = teclado.nextInt();
        System.out.println("Digite o valor de b");
        b = teclado.nextInt();
        if (numero1<0){
            System.out.println("Número negativo");
        }
        else{
            System.out.println("Número positivo");
        }
        if (numero2%2==0){
            System.out.println("Número Par");
        }
        else {
            System.out.println("Número ímpar");
        }
        if (b%a==0 || a%b==0){
            System.out.println("São múltiplos");
        }
        else {
            System.out.println("Não são múltiplos");
        }
            teclado.close();
    }
}
