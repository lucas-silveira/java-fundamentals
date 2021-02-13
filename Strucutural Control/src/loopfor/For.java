package loopfor;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        int num, soma = 0;
        double media;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite 10 números: ");

        for (int i = 0; i < 10; i++) {
            num = input.nextInt();
            soma += num;
        }

        media = (double) soma/10;

        System.out.printf("Soma dos números digitados: %d\n", soma);
        System.out.printf("Média dos números digitados: %.2f\n", media);

        input.close();
    }
}