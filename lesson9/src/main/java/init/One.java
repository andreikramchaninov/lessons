package init;

public class One {
  private Printer p0 = new Printer("One 0 field");
  private Printer p1 = new Printer("One 1 field");
  private static Printer p2 = new Printer("One static field");

  private static String str = createString();
  //System.out.println("One str - " + str);

  {
    new Printer("One initializer");
    System.out.println("in initializer");
  }

  static {
    new Printer("Static initializer");
  }

  public One() {
    new Printer("One constructor");
  }

  private static String createString() {
    return "Hello";
  }
}
