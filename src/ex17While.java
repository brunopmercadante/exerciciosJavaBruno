import java.util.Scanner;
public class ex17While {
        public static void main(String[] args) {
            // Faça um programa para ler um número indeterminado de dados, contendo cada um,
            // a idade de um indivíduo. O último dado, que não entrará nos cálculos,
            // contém um valor de idade negativa. Calcular e imprimir a idade média
            // deste grupo de indivíduos. Se for entrado um valor negativo na primeira vez,
            // mostrar a mensagem "impossível Calcular"
            Scanner teclado = new Scanner(System.in);
            int idade = teclado.nextInt();
            int soma = 0;
            int quantidade = 0;
            double media;

            while (idade >= 0){
                soma = soma + idade;
                quantidade = quantidade + 1;
                idade = teclado.nextInt();
            }
            if (quantidade>0){
                media = (double) soma / quantidade;
                System.out.printf("%.2f%n",media);
            }
            else {
                System.out.println("Impossível calcular");
            }
        }
    }

