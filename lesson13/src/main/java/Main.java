import data.*;

public class Main {

  public static void main(String[] args) {
    Bag<String> bag = new Bag<>();
    Bag<Integer> bag2 = new Bag<>();
    bag2.add(new Integer(10));
    bag2.add(10);

    //Bag.Node<Integer> bnode = new Bag.Node<>();
    Iterator<Integer> bagIterator = bag.iterator();
    while(bag.hasNext()) {
      System.out.println(bagIterator.next());
    }
  }

}
