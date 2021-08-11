public class TestStudentValidator {
  public static void main(String[] args) {
    Student student = null;
    Student student2 = new Student("John", -1);
    Student student3 = new Student("Mary", 8);

//    StudentValidator.validate(student); // Exception in thread "main" java.lang.IllegalArgumentException: O argumento student está nulo
//    StudentValidator.validate(student2); // Exception in thread "main" NegativeException: Erro: valor negativo
    StudentValidator.validate(student3);

    try {
      StudentValidator.validate(student);
      StudentValidator.validate(student2);
    } catch (IllegalArgumentException err) {
      System.out.println("Erro #1: " + err.getMessage());
    } catch (NegativeException err) {
      System.out.println("Erro #2: " + err.getMessage());
    } catch (NullPointerException | UnsupportedOperationException err) { // another alternative
      System.out.println("Erro #3: " + err.getMessage());
    } catch (Exception err) {
      System.out.println("Erro genérico: " + err.getMessage());
    }
  }
}
