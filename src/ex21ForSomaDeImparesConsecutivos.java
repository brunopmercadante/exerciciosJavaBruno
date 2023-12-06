import java.util.Scanner;
public class ex21ForSomaDeImparesConsecutivos {
    public static void main(String[] args) {
        //Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.
        //Entrada - O arquivo de entrada contém dois valores inteiros.
        //Saída - O programa deve imprimir um valor inteiro. Este valor é a soma dos valores ímpares
        // que estão entre os valores fornecidos na entrada que deverá caber em um inteiro.
        //Exemplo de Entrada: 6 e -5 -> Exemplo de saída: 5
        Scanner teclado = new Scanner(System.in);
        int x,y;
        System.out.println("Insira o valor de X:");
        x = teclado.nextInt();
        System.out.println("Insira o valor de y:");
        y = teclado.nextInt();
        int min,max;
        if (x<y){
          min = x;
          max = y;
        }
        else{
            min = y;
            max = x;
        }
        int soma = 0;
        for (int i = min + 1; i < max; i++){
            if (i % 2 != 0){
                soma = soma + i;
            }
            System.out.println(soma);
        }
        teclado.close();
    }
}
