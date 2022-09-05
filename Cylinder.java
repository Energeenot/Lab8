package Lab8;

import java.util.Scanner;

public class Cylinder {
    protected point circleCenter = new point();
    protected point pointOfCircle = new point();
    int h;
    public Cylinder(double x,double y, double x1, double
            y1){
        circleCenter.setX(x);
        circleCenter.setY(y);
        pointOfCircle.setX(x1);
        pointOfCircle.setY(y1);
    }
    public Cylinder(){
    } public double baseOfArea(){
        double radius = point.distance(circleCenter,
                pointOfCircle);
        return radius*radius*Math.PI;
    } public double lengthOfCircle(){
        return 2*Math.PI*point.distance(circleCenter,
                pointOfCircle);
    } public double volume(){
        return baseOfArea()*h;
    } public double sideSurfaceArea(){
        return lengthOfCircle()* h;
    } public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты x и y центра окружности: ");
        double x = scanner.nextDouble();
        circleCenter.setX(x);
        circleCenter.setY(scanner.nextDouble());
        System.out.println("Введите координаты второй точки"); pointOfCircle.setX(scanner.nextDouble());
                pointOfCircle.setY(scanner.nextDouble());
        System.out.println("Введите высоту ");
        h = scanner.nextInt();
    } public void print(){
        System.out.println("Кординаты центра: ");
        System.out.println(point.toString(circleCenter));
        System.out.println("Координаты точки на окр:");
        System.out.println(point.toString(pointOfCircle));
    }
}
