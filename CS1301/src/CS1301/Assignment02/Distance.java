package CS1301.Assignment02;

import java.util.Scanner;

// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 2

public class Distance {

    public static void main(String[] args) {

        System.out.print("Enter x1 and y1: ");
        Scanner input = new Scanner(System.in);

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter x2 and y2: ");

        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) +
                                    Math.pow(y2 - y1, 2));

        System.out.format("The distance between the two points is %f\n", distance);
    }

}
