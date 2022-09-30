package Lab7;

import java.lang.*;
import java.util.Scanner;

public class Main {
    public final static double g = 9.8;

    public static double periodCalculator(double length) {
        return 2 * Math.PI * Math.sqrt(length / g);

    }

    public static void main(String[] args) {
//        System.out.print("Please enter the length of the pendulum: ");
//        Scanner sc = new Scanner(System.in);
//        double length = sc.nextDouble();
//        System.out.println(String.format("The period of the pendulum is %.2f seconds", periodCalculator(length)));
        System.out.println(String.format("one : %h, two: %h", 'c', 2));
    }
}
