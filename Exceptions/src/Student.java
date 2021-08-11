import java.util.Objects;

public class Student {
  private String name;
  private double rating;

  public Student(String name, double rating) {
    setName(name);
    setRating(rating);
  }

  public String name() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double rating() {
    return rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

  public boolean isApproved() {
    return rating() >= 7;
  }

  public String toString() {
    return "name: " + name() + "\nnota: " + rating();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return Double.compare(student.rating(), rating) == 0 && Objects.equals(name, student.name());
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, rating);
  }
}
