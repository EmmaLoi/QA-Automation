package HW_34;

public class Dog implements Comparable<Dog>{

  private String name;
  private Integer year;

  public Dog(String name, Integer year) {
    this.name = name;
    this.year = year;
  }

  @Override
  public String toString() {
    return "Dog{" +
        "name='" + name + '\'' +
        ", year=" + year +
        '}';
  }

  @Override
  public int compareTo(Dog o) {
    return year - o.year;
  }
}