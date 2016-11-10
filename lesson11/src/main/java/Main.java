import animals.*;
//import shape.example1.Shape;
//import shape.example1.Shapes;
import shape.example3.Shape;
import shape.example3.Circle;
import shape.example3.Rectangle;
import shape.example3.Square;

import template.Foo;

public class Main {

  public static void main(String[] args) {

    Shape[] shapes = { new Circle(10.0), new Square(4.0), new Rectangle(10.0, 5.0)};
    for (Shape shape : shapes) {
      System.out.println(shape.calculateArea());
    }

    //Shape circle = new Circle(10.0);
    //System.out.println(circle.calculateArea());

    //Shape shape = new Shape();
    //System.out.println("Area of square = " + shape.calculateArea(Shapes.SQUARE));
    //System.out.println("Area of rectangle = " + shape.calculateArea(Shapes.RECTANGLE));
    //System.out.println("Area of circle = " + shape.calculateArea(Shapes.CIRCLE));

    //---------template----------
  }

  public void instanceofAnimals() {
    Animal animal = new Animal();
    Dog dog = new Dog();
    Cat cat = new Cat();

    Cat catnull = null;

    if (dog instanceof Dog) {
      System.out.println("Dog");
    }

    if (animal instanceof Dog) {
      System.out.println("Dog");
    } else {
      System.out.println("not a Dog");
    }

    if (catnull instanceof Animal) {
      System.out.println("A");
    }
  }

}
