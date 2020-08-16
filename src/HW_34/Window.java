package HW_34;

public class Window {
  private String size;
  private String material;

  public Window(String size, String material) {
    this.size = size;
    this.material = material;
  }

  @Override
  public String toString() {
    return "Window{" +
        "size='" + size + '\'' +
        ", material='" + material + '\'' +
        '}';
  }
}