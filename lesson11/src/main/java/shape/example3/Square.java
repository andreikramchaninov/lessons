package shape.example3;

public class Square implements Shape {
  private double width;

  public Square (double width) {
    this.width = width;
  }

  public double calculateArea() {
    double area = 0.0;
    area = width * width;
    return area;
  }
}
