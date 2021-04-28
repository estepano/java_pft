package lesson1.points;

public class Point {

    double a;
    double b;

    public Point(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double distance(Point point) {
        return Math.sqrt(((point.a - this.a) * (point.a - this.a)) + ((point.b - this.b) * (point.b - this.b)));
    }


}
