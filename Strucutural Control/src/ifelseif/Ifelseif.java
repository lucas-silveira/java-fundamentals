package ifelseif;

import java.util.Scanner;

public class Ifelseif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota: ");

        double rate = input.nextDouble();

        if (rate > 10 || rate < 0) {
            System.out.println("Nota inválida.");
        } else if (rate >= 8) {
            System.out.println("Conceito A");
        } else if (rate >=6 && rate < 8) {
            System.out.println("Conceito B");
        } else {
            System.out.println("Conceito C");
        }

        input.close();
    }
}
