package shape.example3;

public class Rectangle implements Shape {
  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double calculateArea() {
    double area = 0.0;
    area = width * height;
    return area;
  }
}
