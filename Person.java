package Lab8;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Person {
    private String surname;
    private String name;
    private LocalDate birthday;
    private char sex;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setSex(char sex) {
        if (sex == 'м' || sex == 'ж'){
            this.sex = sex;
        }else {
            System.out.println("Пол указан некоректно, попробуйте снова");
            Runtime.getRuntime().exit(1);
        }
    }

    public char getSex() {
        return sex;
    }

    Person(){}

    public Person(String surname, String name, LocalDate birthday, char sex){
        this.surname = surname;
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
    }

    public void inputPerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию");
        String surname = scanner.nextLine();
        setSurname(surname);
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        setName(name);
        System.out.println("Введите дату дня рождения, год, месяц, день");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        LocalDate birthday = LocalDate.of(year, month, day);
        setBirthday(birthday);
        System.out.println("Введите пол человека");
        char sex = scanner.next().charAt(0);
        setSex(sex);
    }

    public void printPerson(){
        System.out.println(getSurname());
        System.out.println(getName());
        System.out.println("Дата рождения - " + getBirthday());
        System.out.println("Пол " + getSex());
        System.out.println("Возраст " + getAge(birthday, LocalDate.now()));
    }
    public int getAge(LocalDate birthday, LocalDate currentDate){
        return Period.between(birthday, currentDate).getYears();
    }
}
