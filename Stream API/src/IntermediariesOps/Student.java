package IntermediariesOps;

public class Student {
  private String name;
  private double rating;

  public Student(String name, double rating) {
    this.setName(name);
    this.setRating(rating);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getRating() {
    return rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

  public boolean isApproved() {
    return this.getRating() >= 7;
  }
}
