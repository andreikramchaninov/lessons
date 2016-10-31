class Main {

  public static void main(String[] args) {

    LightBulb ltb = new LightBulb();
    ltb.on();

    LightBulb ltb2 = new LightBulb();
    ltb2.switchBulb();

    LightBulb ltb3 = new LightBulb();

    ltb3 = ltb;

    System.out.println(ltb3.state);

    if (ltb.equals(ltb2)) {
      System.out.println("Equal");
    } else System.out.println("Not equal");


  }

}
