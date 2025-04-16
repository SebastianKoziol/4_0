
/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/
import java.util.Scanner;
import java.io.IOException;

class Main {
  public static void main(String[] args) {
    try {

      Scanner skan = new Scanner(System.in);
      System.out.println("Podaj imie: ");
      String name = skan.nextLine();
      System.out.println("Podaj wiek: ");
      int age = skan.nextInt();
      Student s1 = new Student(name, age);
      System.out.println(s1.ToString());

      Service s = new Service();
      var students = s.getStudents();
      for (Student current : students) {
        System.out.println(current.ToString());
      }
    } catch (IOException e) {

    }
  }
}