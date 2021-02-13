package switchcase;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        int cod;
        double sal, aumento = 0, novoSal;
        String cargo = "";
        Scanner input = new Scanner(System.in);

        System.out.println("Código:");
        cod = input.nextInt();

        System.out.println("Salário:");
        sal = input.nextDouble();

        switch (cod) {
            case 1:
                aumento = 0.5;
                cargo = "Escrituário";
                break;
            case 2:
                aumento = 0.35;
                cargo = "Secretário";
                break;
            case 3:
                aumento = 0.2;
                cargo = "Caixa";
                break;
            case 4:
                aumento = 0.1;
                cargo = "Gerente";
                break;
            case 5:
            case 6:
                aumento = 0;
                cargo = "Diretor";
                break;
            default:
                aumento = 0;
                cargo = "Desconhecido";
        }

        aumento = sal*aumento;
        novoSal = sal+aumento;

        System.out.printf("Salário: %.2f\n", sal);
        System.out.printf("Aumento: %.2f\n", aumento);
        System.out.printf("Novo salário: %.2f\n", novoSal);
        System.out.println("Cargo: " + cargo);

        input.close();
    }
}
