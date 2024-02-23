package exercicio03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Digite o primeiro valor: ");
        a = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("São mutiplos");
        } else {
            System.out.println("Não são Multiplos");
        }
    }
}
