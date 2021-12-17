package Bai8.Comparator;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorCircleTest {
    public static void main(String[] args) {
        Circle[] circle = new Circle[3];
        circle[0] = new Circle(3.6);
        circle[1] = new Circle();
        circle[2] = new Circle("indigo", false, 3.5);

        System.out.println("Pre-sorted:");
        for (Circle circles : circle) {
            System.out.println(circles);
        }

        Comparator circleComparator = new ComparableCircle();
        Arrays.sort(circle, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circles : circle) {
            System.out.println(circles);
        }
    }
}
