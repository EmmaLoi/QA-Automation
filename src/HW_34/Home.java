package HW_34;
import java.util.Objects;

public class Home implements Comparable<Home> {
  private Window window;
  private String door;
  private String area;
  private Integer year;

  public Home(Window window, String door, String area, Integer year) {
    this.window = window;
    this.door = door;
    this.area = area;
    this.year = year;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Home home = (Home) o;
    return Objects.equals(window, home.window) &&
        Objects.equals(door, home.door) &&
        Objects.equals(area, home.area) &&
        Objects.equals(year, home.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(window, door, area, year);
  }

  @Override
  public String toString() {
    return "Home{" +
        "window=" + window +
        ", door='" + door + '\'' +
        ", area='" + area + '\'' +
        ", year=" + year +
        '}';
  }

  @Override
  public int compareTo(Home o) {
    return year - o.year;
  }
}