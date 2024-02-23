package exercicio01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int x = sc.nextInt();

        if (x < 0) {
            System.out.println("Número Negativo");
        } else {
            System.out.println("Número Positivo");
        }
    }
}
