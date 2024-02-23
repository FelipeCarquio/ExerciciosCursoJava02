package exercicio04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hinicial, hfinal, duracao;
        System.out.print("Digite a hora inicial do jogo: ");
        hinicial = sc.nextInt();
        System.out.print("Digite a hora final do jogo: ");
        hfinal = sc.nextInt();

        if (hinicial < hfinal) {
            duracao = hfinal - hinicial;
        } else {
            duracao = 24 - hinicial + hfinal;
        }

        System.out.println("Jogo durou " + duracao + " Hora(s)");
    }
}
