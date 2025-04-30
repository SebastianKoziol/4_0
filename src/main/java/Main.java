
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
      String name;
      String surName;
      int day, month, year;
      int age;
      int x;
      while (true) {

        System.out.println("Co chciabys zrobić?");
        System.out.println("1. Dodaj studenta");
        System.out.println("2. Wypisz studentów");
        System.out.println("3. Znajdź studenta po imieniu");
        System.out.println("0. Wyjście ");
        System.out.println(" \n");
        x = skan.nextInt();
        switch (x) {
          case 1:
            System.out.println("Podaj imie: ");
            name = skan.next();
            System.out.println("Podaj nazwisko: ");
            surName = skan.next();
            System.out.println("Podaj wiek: ");
            age = skan.nextInt();
            System.out.println("Podaj dzien urodzenia : ");
            day = skan.nextInt();

            if (day < 1 || day > 31) {
              System.out.println("Podaj poprawny dzien urodzenia : ");
              day = skan.nextInt();
            }
            System.out.println("Podaj miesiac urodzenia : ");
            month = skan.nextInt();
            if (month < 1 || month > 12) {
              System.out.println("Podaj poprawny miesiac urodzenia : ");
              month = skan.nextInt();
            }
            System.out.println("Podaj rok urodzenia : ");
            year = skan.nextInt();
            if (year < 1 || year > 3000) {
              System.out.println("Podaj poprawny rok urodzenia : ");
              year = skan.nextInt();
            }
            Student s1 = new Student(name, surName, age, day, month, year);
            s.addStudent(s1);
            break;
          case 2:

            var students = s.getStudents();
            for (Student current : students) {
              System.out.println(current.ToString());
            }
            break;
          case 3:
            System.out.println("Podaj imie: ");
            name = skan.next();
            Student student = s.findStudentByName(name);
            if (student != null)
              System.out.println(student.ToString());
            else
              System.out.println("Nie znaleziono studenta o imieniu " + name);
            break;
          case 0:
            System.exit(0);
        }
      }
    } catch (IOException e) {

    }
  }
}