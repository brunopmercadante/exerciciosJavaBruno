import java.util.Scanner;
public class ex14Quadrante {
    public static void main(String[] args) {
        //Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
        //de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
        //ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
        //Se o ponto estiver na origem, escreva a mensagem “Origem”.
        //Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
        Scanner teclado = new Scanner(System.in);
        double x,y;
        System.out.println("Digite o valor de x");
        x = teclado.nextDouble();
        System.out.println("Digite o valor de y");
        y = teclado.nextDouble();

        if (x>0 && y>0){
            System.out.println("O ponto está no primeiro quadrante (Q1)");
        }
        else if (x<0 && y>0){
            System.out.println("O ponto está no segundo quadrante (Q2)");
        }
        else if (x<0 && y<0){
            System.out.println("O ponto está no terceiro quadrante (Q3)");
        }
        else if (x>0 && y<0){
            System.out.println("O ponto está no quarto quadrante (Q4)");
        }
        else if (x==0 && y==0){
            System.out.println("O ponto está localizdo na ORIGEM");
        }
        else if (x==0 && y!=0){
            System.out.println("O ponto está localizado no eixo X");
        }
        else if (x!=0 && y==0){
            System.out.println("O ponto está localizado no eixo y");
        }
        teclado.close();
    }
}
