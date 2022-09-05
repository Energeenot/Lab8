package Lab8;

import java.util.Scanner;

public class Prisma extends Cylinder {
    protected point thirdPoint = new point();
    public double baseOfArea(){
        double a1= point.distance(this.thirdPoint,
                this.circleCenter);
        double a2 = point.distance(this.thirdPoint,
                this.pointOfCircle);
        double a3 = point.distance(this.pointOfCircle,
                this.circleCenter);
        double p = (a1+a2+a3)*0.5;
        System.out.println(p);
        return Math.sqrt(p*(p-a1)*(p-a2)*(p-a3));
    } public double lengthOfCircle(){
        double a1= point.distance(this.thirdPoint,
                this.circleCenter);
        double a2 = point.distance(this.thirdPoint,
                this.pointOfCircle);
        double a3 = point.distance(this.pointOfCircle,
                this.circleCenter);
        return a1+a2+a3;
    } public void input(){
        super.input();
        System.out.println("Введите координаты третьей точки ");
                Scanner scanner = new Scanner(System.in);
        thirdPoint.setX(scanner.nextDouble());
        thirdPoint.setY(scanner.nextDouble());
    } public void print(){
        super.print();
        System.out.println("Координаты третьей точки");
        System.out.println(thirdPoint.toString(thirdPoint));
    }
}
