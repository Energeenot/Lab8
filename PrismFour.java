package Lab8;

import java.util.Scanner;

public class PrismFour extends Prisma{
    point pointFour = new point();
    public double sinus(point p1, point p2, point p3, point p4){
        point coordOfDiagonale1 = new
                point(p3.getX()-p1.getX(), p3.getY()-p1.getY());
        point coordOfDiagonale2 = new
                point(p2.getX()-p4.getX(),p2.getY()-p4.getY());
        double distance1 = point.distance(p1,p3);
        double distance2 = point.distance(p2,p4);
        double cosD1D2 = (
                (coordOfDiagonale1.x*coordOfDiagonale2.x +
                        coordOfDiagonale2.y*coordOfDiagonale1.y)/(distance1*distance2) ) ;
        double sinD1d2=Math.sqrt(1-cosD1D2*cosD1D2);
        return sinD1d2;
    }
    public double baseOfArea(){
        double distance1 =
                point.distance(circleCenter,thirdPoint);
        double distance2 =
                point.distance(pointOfCircle,pointFour);
        return ( 0.5*sinus(circleCenter, pointOfCircle,
                thirdPoint, pointFour)*distance1*distance2);
    }
    public double lengthOfCircle(){
        double a1 = point.distance(circleCenter,pointOfCircle);
        double a2 = point.distance(pointOfCircle,
                thirdPoint);
        double a3 = point.distance(thirdPoint, pointFour);
        double a4 = point.distance(pointFour,
                circleCenter);
        return a1+a2+a3+a4;
    }
    public boolean checkPar(){
        boolean result = false;
        double a1 = point.distance(circleCenter,pointOfCircle);
        double a2 = point.distance(pointOfCircle, thirdPoint);
        double a3 = point.distance(thirdPoint, pointFour);
        double a4 = point.distance(pointFour,
                circleCenter);
        if(a1==a3 && a2==a4) result = true;
        return result;
    }
    public boolean checkPryamPar(){
        boolean result = false;
        if(checkPar() && sinus(circleCenter, pointFour,
                circleCenter, thirdPoint) == 1 &&
                sinus(thirdPoint,pointOfCircle,thirdPoint,pointFour)==1 )
            result = true;
        return result;
    }
    public boolean checkKub(){
        double a1 =
                point.distance(circleCenter,pointOfCircle);
        double a2 = point.distance(pointOfCircle,
                thirdPoint);
        double a3 = point.distance(thirdPoint, pointFour);
        double a4 = point.distance(pointFour,
                pointOfCircle);
        if(a1==a2 && a1==a3 && a1==a4 && a1==this.h &&
                checkPryamPar()) {
            return true;
        }else return false;
    }
    public void input(){
        super.input();
        System.out.println("Координаты четвертой точки");
        Scanner scanner = new Scanner(System.in);
        pointFour.setX(scanner.nextDouble());
        pointFour.setY(scanner.nextDouble());
    }
    public void print(){
        super.print();
        System.out.println("Коордианты четвертой ");
        System.out.println(pointFour.toString(pointFour));
    }
}
