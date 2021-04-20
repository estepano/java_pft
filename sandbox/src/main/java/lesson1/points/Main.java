package lesson1.points;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.a = 2;
        p1.b = 5;

        Point p2 = new Point();
        p2.a = 3;
        p2.b = 7;

        System.out.println(distance(p1, p2));
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(((p2.a - p1.a) * (p2.a - p1.a)) + ((p2.b - p1.b) * (p2.b - p1.b)));
    }


}
