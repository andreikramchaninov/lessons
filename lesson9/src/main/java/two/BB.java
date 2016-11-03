package two;

import one.B;

public class BB extends B {

  String str = "";

  public static final String CONSTANT = "1";
  public final String CONSTANT2;

  public BB() {
    CONSTANT2 = "1";
  }

  @Override
  public void foo() {
    System.out.println("B");
  }

}
