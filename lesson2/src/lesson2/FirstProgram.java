package lesson2;

public class FirstProgram {
  static int i = 10;

    public static void main(String[] args) {
      int i = 10;
      /* */
      while (i >= 1) {
        System.out.println(isEven(i));
        i--;
      }

      for (int j = 10; j > 0; j--) {
        System.out.println(isEven(j));
      }

      do {
        System.out.println("in do-while");
      } while (false);

      int h = 10;
      while(true) {
        System.out.println("in while");
        if (h == 0) break;
        h--;
      }

      isEven(10);
    }

    public static boolean isEven(int i){
      return (i % 2 == 0);

    }
}
