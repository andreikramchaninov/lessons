package animals;

public interface Animal {

  String PSEUDO_CONST = "Hello";

  public abstract void makeNoise();

  void eatFood(Food food);

}
