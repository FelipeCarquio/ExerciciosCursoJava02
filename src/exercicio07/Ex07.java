package exercicio07;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.print("Digite o Eixo X: ");
        x = sc.nextDouble();
        System.out.print("Digite o Eixo Y: ");
        y = sc.nextDouble();
        
        if (x == 0 && y == 0) {
            System.out.println("Eixo X: " + x + " Eixo Y: " + y + " : Você esta na origem.");
        } else if (x > 0 && y > 0) {
            System.out.println("Eixo X: " + x + " Eixo Y: " + y + " : Você esta no Q1.");
        } else if (x < 0 && y > 0) {
            System.out.println("Eixo X: " + x + " Eixo Y: " + y + " : Você esta no Q2.");
        } else if (x < 0 && y < 0) {
            System.out.println("Eixo X: " + x + " Eixo Y: " + y + " : Você esta no Q3.");
        } else {
            System.out.println("Eixo X: " + x + " Eixo Y: " + y + " : Você esta no Q4.");
        }
    }
}
