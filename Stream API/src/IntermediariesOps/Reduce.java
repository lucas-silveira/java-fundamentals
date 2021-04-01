package IntermediariesOps;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce {
  public static void main(String[] args) {
    List<Integer> numbs = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    // Reduce
    BinaryOperator<Integer> sum = (accumulator, current) -> accumulator + current;
    int result = numbs.stream().reduce(sum).get();
    System.out.println(result); // 45

    // with initial value
    Integer result2 = numbs.stream().reduce(100, sum); // with initial value, get method is not necessary
    System.out.println(result2); // 145

    numbs.stream().filter(n -> n > 10).reduce(sum).ifPresent(System.out::println);

    Student student1 = new Student("John", 7.8);
    Student student2 = new Student("Clark", 5.8);
    Student student3 = new Student("Alice", 9.8);
    Student student4 = new Student("Ben", 6.8);
    Student student5 = new Student("Stuart", 7.1);
    Student student6 = new Student("Bea", 8.8);

    List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6);

    Predicate<Student> approved = student -> student.isApproved();
    Function<Student, Double> onlyRating = student -> student.getRating();
    BinaryOperator<Double> sumRating = (acc, cur) -> acc + cur;

    students.parallelStream()
            .filter(approved)
            .map(onlyRating)
            .reduce(sumRating)
            .ifPresent(System.out::println); // 33.5
  }
}
