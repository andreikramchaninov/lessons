package shape.example1;

import shape.example1.Shapes;

public class Shape {
  private double width = 10.0;
  private double height = 5.0;
  private double radius = 10.0;

  public double calculateArea(Shapes shape) {
    double area = 0.0;
    switch (shape) {
      case SQUARE: area = width * width;
      break;
      case RECTANGLE: area = width * height;
      break;
      case CIRCLE: area = radius * radius * Math.PI;
      break;
      default: area = 0.0;
    }
    return area;
  }

}
