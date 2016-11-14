package strategy;

public class Duck {
  private String name;
  private FlyBehavior flyBehavior;

  public Duck(String name) {
    this.name = name;
    this.flyBehavior = new FlyWithWings();
  }

  public void display() {
    System.out.println(name);
  }

  public void quack() {
    System.out.println("Quack-quack");
  }

  public void swim() {

  }

  public void fly() {

  }

}
