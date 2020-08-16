package HW_34;

public class Car implements Comparable<Car> {
  private String model;
  private String color;
  private Integer year;

  public Car(String model, String color, Integer year) {
    this.model = model;
    this.color = color;
    this.year = year;
  }

  @Override
  public String toString() {
    return "Car{" +
        "model='" + model + '\'' +
        ", color='" + color + '\'' +
        ", year=" + year +
        '}';
  }

  @Override
  public int compareTo(Car o) {
    return year - o.year;
  }
}
