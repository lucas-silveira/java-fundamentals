package loopwhile;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int num, soma = 0, cont = 0;
        double media;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite vários números (-1 encerra):");
        num = input.nextInt();

        while (num != -1) {
            soma += num;
            cont++;
            num = input.nextInt();
        }

        if (cont != 0) {
            media = (double) soma/cont;
            System.out.println("Soma dos números digitados: " + soma);
            System.out.println("Média dos números digitados: " + media);
        }
        else
            System.out.println("Não houve processamento");

        input.close();
    }
}