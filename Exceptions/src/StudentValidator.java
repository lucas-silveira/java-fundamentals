public class StudentValidator {
  private StudentValidator() {}

  public static void validate(Student student) {
    if (student == null) throw new IllegalArgumentException("O argumento student está nulo");

    if (student.rating() < 0) throw new NegativeException();
  }
}
