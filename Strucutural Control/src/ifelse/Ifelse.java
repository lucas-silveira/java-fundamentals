package ifelse;

import java.util.Scanner;

class Ifelse {
    public static void main(String[] args) {
        double n1, n2, n3, media;
        Scanner input = new Scanner(System.in);

        System.out.println("Nota 1:");
        n1 = input.nextDouble();

        System.out.println("Nota 2:");
        n2 = input.nextDouble();

        System.out.println("Nota 3:");
        n3 = input.nextDouble();

        media = (n1+n2+n3) / 3;
        System.out.println("Média: " + media);

        if (media < 3)
            System.out.println("Reprovado");
        else
            if (media < 7)
                System.out.println("Exame");
            else
                System.out.println("Aprovado");
    }
}