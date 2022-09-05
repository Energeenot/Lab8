package Lab8;

import java.util.Scanner;

public class workerWithFixedSalary extends Person {
    private int salary;
    private double prize;


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    @Override
    public void inputPerson() {
        Scanner scanner = new Scanner(System.in);
        super.inputPerson();
        System.out.println("Введите размер зароботной платы ");
        this.salary = scanner.nextInt();
        System.out.println("Введите премию");
        this.prize = scanner.nextInt();
    }

    @Override
    public void printPerson() {
        super.printPerson();
        System.out.println("Размер зп " + this.salary);
        System.out.println("Размер премии " +
                this.prize);
        System.out.println("Размер заработной платы с учетом налога " + itogSalary());
    }

    public double fullSalary(){
        return ( salary+salary*(prize/100));
    }

    public double nalog(){
        return 0.13*fullSalary();
    }

    public double itogSalary(){
        return fullSalary()-nalog();
    }
}
