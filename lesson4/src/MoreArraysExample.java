class MoreArraysExample {

  public static void main(String[] args) {
    int[] a1 = new int[5];
    int a2[] = new int[5];

    int[] a3 = new int[] {1, 2};
    int[] a4 = {1, 2};

    int[][] aa1 = new int[5][5];

    int[][] aa2 = new int[5][];
    aa2[0] = new int[5];
    aa2[1] = new int[4];
    aa2[2] = new int[3];
    aa2[3] = new int[2];
    aa2[4] = new int[1];

    int[][] aa3 = {{0,0,0,0,0}, {0,0,0,0}, {0,0,0}, {0,0}, {0}};

    printArray(a1);
    System.out.println();
    print2DArray(aa2);

    some("Hello", "helo", "hehehe");
    some("lead", "__", "++");

   public static void printArray(int[] a) {
     for (int i = 0; i < a.length; i++) {
       System.out.print(a[i] + " ");
     }
     System.out.println();
   }

   public static void print2DArray(int[][] a) {
     for (int i = 0; i < a.length; i++) {
       printArray(a[i]);
     }
   }

   public static void some(String ...args) {
     for (int i = 0; i < args.length; i++) {
       System.out.println(args[i]);
     }
   }
   public static void some2(String lead, String ...args) {
     System.out.println("Start " + lead);
     some(args);
   }

}
