package ru.stqa.pft.sandbox;

import lesson1.points.Point;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {
    @Test
    public void testArea () {
        Point p1 = new Point(1,5);
        Point p2 = new Point(5,10);
        Assert.assertEquals(p1.distance(p2), 6.4031242374328485);

    }
}
