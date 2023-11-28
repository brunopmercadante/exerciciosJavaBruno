import java.util.Scanner;
public class ex11DuracaoJogo {
    public static void main(String[] args) {
        //Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
        // sabendo que o mesmo pode começar em um dia e terminar em outro,
        // tendo uma duração mínima de 1 hora e máxima de 24 horas.
        int horaInicial, horaFinal, duracao;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira a hora que o jogo começou");
        horaInicial = teclado.nextInt();
        System.out.println("Insira a hora que o jogo terminou");
        horaFinal = teclado.nextInt();
        if (horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 + horaFinal - horaInicial;
        }
        System.out.println("O jogo durou " + duracao + " horas");
        ;
    }
}
