import java.util.Scanner;
public class ex6Areas {
    public static void main(String[] args) {
        //Fazer um programa que leia três valores com ponto flutuante de dupla precisão:
        // A, B e C. Em seguida, calcule e mostre:
        //a) a área do triângulo retângulo que tem A por base e C por altura. "a*c/2"
        //b) a área do círculo de raio C. (pi = 3.14159) "pi vezes o raio elevado ao quadrado"
        //c) a área do trapézio que tem A e B por bases e C por altura."A=(a+b)h/2"
        //d) a área do quadrado que tem lado B. "b*b"
        //e) a área do retângulo que tem lados A e B."a*b"
        Scanner teclado = new Scanner(System.in);
        double a,b,c,areaTriangulo,areaCirculo,areaTrapezio,areaQuadrado,areaRetangulo,pi;
        pi = 3.14159;
        System.out.println("Digite o valor de A:");
        a = teclado.nextDouble();
        System.out.println("Digite o valor de B:");
        b = teclado.nextDouble();
        System.out.println("Digite o valor de C:");
        c = teclado.nextDouble();
        areaTriangulo = a*c/2;
        areaCirculo = pi*c*c;
        areaTrapezio = (a+b)*c/2;
        areaQuadrado = b*b;
        areaRetangulo = a*b;
        System.out.printf("a área do triângulo retângulo é de %.3f\n", areaTriangulo);
        System.out.printf("a área do circulo é de %.3f\n", areaCirculo);
        System.out.printf("a área do trapézio é de %.3f\n", areaTrapezio);
        System.out.printf("a área do quadrado é de %.3f\n", areaQuadrado);
        System.out.printf("a área do retângulo é de %.3f\n", areaRetangulo);
        teclado.close();
    }
}
