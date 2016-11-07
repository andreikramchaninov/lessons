import animals.*;

public class Main {

  public static void main(String[] args) {
    //Animal animal = new Animal();
    Tiger tiger = new Tiger();
    Lion lion = new Lion();
    Bear bear = new Bear();
    Nothing bear2 = new Bear();
    Bear bear3 = (Bear) bear2;

    Animal[] zoo = {tiger, lion, bear};
    for (int i = 0; i < zoo.length; i++) {
      zoo[i].makeNoise();
    }

    bear.eatFood(Food.MEAT);

    Dog dg = new Dog();
    Cat ct = new Cat();

    //anm = ct;

    //dg = anm; //fails
    //dg = ct; //fails
  }

}
