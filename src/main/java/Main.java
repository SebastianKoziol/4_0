
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
      Service s = new Service();
      String imie;
      int age;
      int x;
      while (true) {

        System.out.println("Co chciabys zrobić?");
        System.out.println("1. Dodaj studenta");
        System.out.println("2. Wypisz studentów");
        System.out.println("0. Wyjście ");
        System.out.println(" \n");
        x = skan.nextInt();
        switch (x) {
          case 1:
            System.out.println("Podaj imie: ");
            imie = skan.next();
            System.out.println("Podaj wiek: ");
            age = skan.nextInt();
            Student s1 = new Student(imie, age);
            s.addStudent(s1);
            break;
          case 2:

            var students = s.getStudents();
            for (Student current : students) {
              System.out.println(current.ToString());
            }
            break;
        }
      }

    } catch (IOException e) {

    }
  }
}