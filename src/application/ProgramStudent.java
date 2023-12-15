package application;
import java.util.Scanner;
import entities.Student;
public class ProgramStudent {
    /*
    Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Please type the name of the student:");
        student.name = teclado.nextLine();
        System.out.println("Please type the grade from the first semester:");
        student.grade1 = teclado.nextDouble();
        System.out.println("Please type the grade from the Second semester:");
        student.grade2 = teclado.nextDouble();
        System.out.println("Please type the grade from the third semester:");
        student.grade3 = teclado.nextDouble();
        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
        if (student.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        }
        else {
            System.out.println("PASS");
        }
        teclado.close();
    }

}
