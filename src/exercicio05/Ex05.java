package exercicio05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um produto: ");
        System.out.println("[1] Cachorro Quente R$ 4,00");
        System.out.println("[2] X-Salada        R$ 4,50");
        System.out.println("[3] X-Bacon         R$ 5,00");
        System.out.println("[4] Torrada Simples R$ 2,00");
        System.out.println("[5] Refrigerante    R$ 1,50");
        System.out.println();
        System.out.print("Digite o número do menu: ");
        int x = sc.nextInt();
        System.out.print("Digite a quantidade do menu selecionado: ");
        int y = sc.nextInt();
        double tot;

        switch (x){
            case 1:
                tot = y * 4.00;
                System.out.printf("Total: R$ %.2f", tot);
                break;
            case 2:
                tot = y * 4.50;
                System.out.printf("Total: R$ %.2f", tot);
                break;
            case 3:
                tot = y * 5.00;
                System.out.printf("Total: R$ %.2f", tot);
                break;
            case 4:
                tot = y * 2.00;
                System.out.printf("Total: R$ %.2f", tot);
                break;
            case 5:
                tot = y * 1.50;
                System.out.printf("Total: R$ %.2f", tot);
                break;
        }

    }
}
