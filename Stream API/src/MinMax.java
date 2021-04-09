import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MinMax {
  public static void main(String[] args) {
    Student student1 = new Student("John", 7.8);
    Student student2 = new Student("Clark", 5.8);
    Student student3 = new Student("Alice", 9.8);
    Student student4 = new Student("Ben", 6.8);
    Student student5 = new Student("Stuart", 7.1);
    Student student6 = new Student("Bea", 8.8);

    List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6);

    Comparator<Student> bestRatingSort = (s1, s2) -> {
      if (s1.getRating() > s2.getRating()) return 1;
      if (s1.getRating() < s2.getRating()) return -1;
      return 0;
    };

    System.out.println(students.stream().max(bestRatingSort).get());
    System.out.println(students.stream().min(bestRatingSort).get());
  }
}
