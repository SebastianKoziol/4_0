public class Student {

  private String Name;
  private int Age;
  private String SurName;

  public Student(String name, String surName, int age) {
    Name = name;
    SurName = surName;
    Age = age;
  }

  public String GetName() {
    return Name;
  }

  public String GetSurName() {
    return SurName;
  }

  public int GetAge() {
    return Age;
  }

  public String ToString() {
    return Name + " " + SurName + " " + Integer.toString(Age);
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if (data.length != 3)
      return new Student("Parse", "Error", -1);
    return new Student(data[0], data[1], Integer.parseInt(data[2]));
  }
}