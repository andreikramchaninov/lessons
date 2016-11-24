public class Main {

  public static void main(String[] args) {

    List rawList = new List();
    //rawList.add(10); //unsafe

    List<Integer> list2 = new List<>();
    //list2 = rawList; //unsafe

    List<Number> listNum = new List<>();
    listNum.add(10L);
    listNum.add(10.0);

    listNum.add(new List3<Number>());
    //listNum.add(new List<Integer>()); //fails


    //listNum.add((int)'c');
    //listNum.add("String");

    //List<Character> listChar = new List<>(); //fails
    //List<String> liststr = new List<>(); //fails


    Tuple<Integer, String> t1 = new Tuple<>(10, "100");
    int a = t1.first;
    String b = t1.second;

    Tuple<Long, String> t2 = Tuple.<Long, String>create(1L, "John Doe");

    GenericList<String> strList = new GenericList<>();
    strList.addList(new GenericList<Integer>());
    strList.addList(new GenericList<Float>());
    strList.addList(new GenericList<Number>());
    //strList.addList(new GenericList<String>()); //fails
    strList.addList2(new GenericList<Number>());
    strList.addList2(new GenericList<Object>());

    StringTuple t4 = new StringTuple("Hello", "worm");

  }

}

class List<T extends Number> {

  void add(T Item) {}
  void add(List<T> list) {}

}

class List3<T extends Number> extends List<T>{

  void add(T Item) {}
  void add(List<T> list) {}

}


class List2<T extends Foo & Bar> {

  void add(T Item) {

  }

}

class GenericList<T> {
  void add(T Item) {}
  void addList(GenericList<? extends Number> list) {
    list.toString();
    int i = list.size();
    //list.add(1);
  }

  int size() {
    return 0;
  }

  void addList2(GenericList<? super Number> list) {}
}

interface Foo extends Bar {}

interface Bar {}

class FooBar implements Foo, Bar {}



class Tuple<T, S extends String> {
  public final T first;
  public final S second;

  public Tuple(T first, S second) {
    this.first = first;
    this.second = second;
  }

  public void bridgeDemo(String Item) {}

  public static <T, S extends String> Tuple<T, S> create(T first, S second) {
    return new Tuple<>(first, second);
  }
}

class StringTuple extends Tuple<String, String> {
  public StringTuple(String first, String second) {
    super(first, second);
  }

  public void bridgeDemo(String Item) {}
}
