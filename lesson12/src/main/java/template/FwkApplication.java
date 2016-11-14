package template;

public abstract class FwkApplication {
  private boolean run = true;

  public void run() {
    configure();
    while(run) {
      idle();
      //------
      if (counter == 10) run = false;
      counter++;
      //------
    }
    destroy();
  }

  public abstract void configure();

  public abstract void destroy();

  private int counter = 0;
  public abstract void idle();
}
