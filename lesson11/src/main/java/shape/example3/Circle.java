package shape.example3;

public class Circle implements Shape{
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double calculateArea() {
    double area = 0.0;
    area = radius * radius * Math.PI;
    return area;
  }
}
