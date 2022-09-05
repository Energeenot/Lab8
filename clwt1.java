package Lab8;

import java.time.LocalDate;
import java.util.Scanner;

public class clwt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person1 = new Person();
        person1.inputPerson();
        person1.printPerson();
        System.out.println("Введите количество людей");
        Person[] arrayOfPerson = new Person[scanner.nextInt()];
        for (int i = 0; i < arrayOfPerson.length; i++){
            System.out.println("Введите данные " + (i + 1) + "-ого человека");
            arrayOfPerson[i] = new Person();
            arrayOfPerson[i].inputPerson();
        }
        for (int i = 0; i < arrayOfPerson.length; i++){
            System.out.println("Данные " + (i + 1) + "-ого человеке");
            arrayOfPerson[i].printPerson();
        }
    }
}
