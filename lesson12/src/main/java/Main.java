import template.FwkApplication;
import template.Application2;

import comparable.Student;

import java.util.*;

import strategy.Duck;
import strategy.RedHeadDuck;
import strategy.RubberDuck;

public class Main {

  public static void main(String[] args) {
    /*
    Application2 app = new Application2();
    app.run();

    FwkApplication app2 = new Application2();
    app2.run();
    */
    Student st1 = new Student("John", 5);
    Student st2 = new Student("James", 4);
    Student st3 = new Student("Jim", 3);

    Student[] sts = {st1, st2, st3};
    int idx = Arrays.binarySearch(sts, st2);
    System.out.println(sts[idx]);

    System.out.println(st2.compareTo(st1));

    Duck duck1 = new RedHeadDuck("duck1");
    duck1.display();
    duck1.quack();

    Duck duck2 = new RubberDuck("duck2");
    duck2.display();
    duck2.fly();
  }

}
