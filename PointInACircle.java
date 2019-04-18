package pointinacircle;

import java.util.Scanner;

public class PointInACircle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double x1, x2, y1, y2, distance, radius;

        System.out.println("Enter the circle center point with 2 coordiante:");
        x1 = input.nextDouble();
        y1 = input.nextDouble();

        System.out.println("Enter a point with 2 coordiantes:");
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        System.out.println("Enter the radius of the circle:");
        radius = input.nextDouble();
        distance = pointDistanceCalculator(x1, y1, x2, y2);

        if (distance > radius) {
            System.out.printf("Point (%.3f, %.3f) is not in the circle!\n\n", x2, y2);

        } else {
            System.out.printf("Point (%.3f, %.3f) is in the circle!\n\n", x2, y2);

        }

    }

    public static double pointDistanceCalculator(double x1, double y1, double x2, double y2) {

        double distance;
        return distance = Math.sqrt(((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2))));

    }

}
