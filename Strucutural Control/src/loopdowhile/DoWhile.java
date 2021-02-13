package loopdowhile;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int n1, n2;
        char resp;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Digite 2 números:");
            n1 = input.nextInt();
            n2 = input.nextInt();

            System.out.printf("Soma dos números = %d\n", (n1+n2));
            System.out.println("Deseja continuar (s/n)?");
            resp = input.next().charAt(0);
        } while (resp == 's');

        input.close();
    }
}