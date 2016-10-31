package some.program;

class FirstProgram {
  public static void main(String[] args) {
    Object obj = new Object();
    String str = "Hello";

    Student student1 = new Student("John Doe", 12, 25);
    Student student2 = new Student("Johnathan Doelsky", 93, 94);

    System.out.println(student1);
    System.out.println(student2);
    student1.growImidiately();
    System.out.println(student1);

    while(!student1.isAlreadyDead()) {
      student1.growImidiately();
      System.out.println(student1);
    }

    System.out.println(Student.studentQty);

    //for (int i = student1.age; i < 94; i++) {
    //  student1.growImidiately();
    //  System.out.println(student1);
    //}
  }
}

class Student {
  public String name;
  public int age;
  public int deadAge = 94;

  public static int studentQty = 0;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Student(String name, int age, int deadAge) {
    this(name, age);
    this.deadAge = deadAge;
    studentQty++;
  }

  public String toString() {
    if (isAlreadyDead())
      return "I was a student. I'm dead now";
    return "I'm a student. My name is " + name + ". I'm " + age + " years old";
  }

  public void setName(String nameParam) {
    name = nameParam;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return "Mr." + name;
  }

  public int getAge() {
    return age;
  }

  public boolean isAlreadyDead() {
    return age >= deadAge;
  }

  public void growImidiately() {
    age++;
  }
}
