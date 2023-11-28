import java.util.Scanner;
public class ex7IfElse {
    public static void main(String[] args) {
        //Fazer um programa para ler duas notas que um aluno obteve no primeiro e segundo
        // semestre de uma disciplina anual. Em seguida, mostrar a nota final que
        // o aluno obteve no ano juntamente com um texto explicativo.
        // Caso a nota final do alno seja inferior a 60.00, mostrar a mensagem
        // "REPROVADO". Todos os valores devem ter uma casa decimal.

        double nota1,nota2,notaTotal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digita a nota obtida no primeiro semestre");
        nota1 = teclado.nextDouble();
        System.out.println("Digite a nota obtida no segundo semestre");
        nota2 = teclado.nextDouble();
        notaTotal = nota1 + nota2;
        if (notaTotal<60){
            System.out.println("Sua nota final foi " + notaTotal + " portanto, você está REPROVADO!");
        }
        else {
            System.out.println("Sua nota final foi " + notaTotal + " portanto, você foi APROVADOO, parabéns!");
        }

        teclado.close();
    }
}