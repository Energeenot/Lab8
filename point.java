package Lab8;

public class point {
    protected double x;
    protected double y;
    public point(){
        x = 0;
        y = 0;

    } public point(double x, double y){
        this.x = x;
        this.y=y;

    } public static String toString(point x){
        return ( "x = " + x.getX() + ", " + "y = " +
                x.getY());

    } public static double distance(point gm, point gm1){
        return (Math.sqrt( ( gm.getX()-gm1.getX() ) * (
                gm.getX()-gm1.getX() ) + ( gm.getY() - gm1.getY())*
                (gm.getY()-gm1.getY() )));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
