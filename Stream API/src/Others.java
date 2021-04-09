import java.util.Arrays;
import java.util.List;

public class Others {
  public static void main(String[] args) {
    Student student1 = new Student("John", 7.8);
    Student student2 = new Student("Clark", 9.8);
    Student student3 = new Student("Alice", 5.8);
    Student student4 = new Student("Ben", 6.8);
    Student student5 = new Student("Stuart", 7.1);
    Student student6 = new Student("Stuart", 7.1);
    Student student7 = new Student("Bea", 8.8);
    Student student8 = new Student("Bea", 8.8);

    List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6, student7, student8);

    // Distinct: take unique values
    students.stream().distinct().forEach(System.out::println);

    System.out.println("\n");

    // Skip/Limit
    students.stream()
            .distinct()
            .skip(2)
            .forEach(System.out::println);
    System.out.println("\n");
    students.stream()
            .distinct()
            .skip(2)
            .limit(2)
            .forEach(System.out::println);

    System.out.println("\n");

    // Take while
    students.stream()
            .distinct()
            .takeWhile(student -> student.isApproved())
            .forEach(System.out::println);
  }
}
