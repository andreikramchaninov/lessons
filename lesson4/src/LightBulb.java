class LightBulb {

  public boolean state;

  public void on() {
    heatTheBulb();
    state = true;
  }

  public void off() {
    state = false;
  }

  public void switchBulb() {
    state = !state;
  }

  public boolean equalTo (LightBulb ltb) {
    return state == ltb.state;
  }

  public boolean equals(Object that) {
    return equalTo((LightBulb)that);  
  }

  private void heatTheBulb() {

  }

}
