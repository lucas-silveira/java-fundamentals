import java.util.Scanner;

public class Finally {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Digite um número para a divisão (7 / x): ");
      System.out.println(7 / scanner.nextInt());
    } catch (Exception err) {
      System.out.println("Erro: "+ err.getMessage());
    } finally {
      System.out.println("Finalizando...");
      scanner.close();
    }
  }
}
