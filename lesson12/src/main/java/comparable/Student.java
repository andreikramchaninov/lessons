package comparable;

public class Student implements Comparable {
  int score;
  String name;

  public Student(String name, int score) {
    this.score = score;
    this.name = name;
  }

  public int compareTo(Object o) {
    Student other = (Student)o;
    return 0;
  }

  public String toString() {
    return "Name: " + name + "; Score: " + score;
  }
}
