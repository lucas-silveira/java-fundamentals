public class Basic {
  public static void main(String[] args) {

    // System.out.println(7 / 0); // Exception in thread "main" java.lang.ArithmeticException: / by zero
    Student student = null;
    // printName(student); // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Student.name()" because "student" is null

    try {
      System.out.println(7 / 0);
    } catch (ArithmeticException err) {
      System.out.println("Erro: " + err.getMessage());
    }

    try {
      printName(student);
    } catch (Exception err) {
      System.out.println("Erro ao imprimir o nome do usuário. Erro: " + err.getMessage());
    }
  }

  public static void printName(Student student) {
    System.out.println(student.name());
  }
}
