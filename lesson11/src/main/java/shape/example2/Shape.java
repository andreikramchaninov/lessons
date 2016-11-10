package shape.example2;

public class Shape {
  public double calculateArea(Object obj) {
    //instanceof
    double area = 0.0d;
    if (obj instanceof Circle) {
      Circle circle = (Circle) obj;
      area = circle.getRadius() * circle.getRadius() * Math.PI;
    } else if (obj instanceof Square) {
      Square square = (Square) obj;
      area = square.getWidth() * square.getWidth();
    } else if (obj instanceof Rectangle) {
      Rectangle rect = (Rectangle) obj;
      area = rect.getWidth() * rect.getHeight();
    }
    return area;
  }
}
