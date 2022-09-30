package Lab1_6;

import java.util.Scanner;

public class Main {
    public static void showOptions() {
        System.out.println("Please enter what you want to do:\n1)Find area of cylinder" +
                "\n2)Find area of semicircle\n3)Find area of triangle\n4)Quit");
    }

    public static int optionChoice() {
        Scanner sc = new Scanner(System.in);
        int optionNumber = sc.nextInt();
        return optionNumber;
    }

    public static double areaOfCylinder(double r, double h) {
        return Math.PI * r * r * h;
    }

    public static double areaOfSemiCircle(double r) {
        return Math.PI * r * r / 2;
    }

    public static double areaOfTriangle(double b, double h) {
        return b * h / 2;
    }

    public static void main(String[] args) {
        Lab6 lab = new Lab6("1", "100", "50", "20", "200");
        showOptions();
        Scanner sc = new Scanner(System.in);
        switch (optionChoice()) {
            case 1:
                System.out.print("Please enter the radius of the cylinder: ");
                double radius = sc.nextDouble();
                System.out.print("Please enter the height of the cylinder: ");
                double height = sc.nextDouble();
                System.out.print(String.format("Area of cylinder is: %.2f %n\n\n", areaOfCylinder(radius, height)));
                main(args);
                break;
            case 2:
                System.out.print("Please enter the radius of the semicircle: ");
                double radiusSemiCircle = sc.nextDouble();
                System.out.print(String.format("Area of semicircle is: %.2f %n\n\n", areaOfSemiCircle(radiusSemiCircle)));
                main(args);
                break;
            case 3:
                System.out.print("Please enter the base length of the triangle: ");
                double length = sc.nextDouble();
                System.out.print("Please enter the height of the cylinder: ");
                double heightTriangle = sc.nextDouble();
                System.out.print(String.format("Area of cylinder is: %.2f %n\n\n", areaOfTriangle(length, heightTriangle)));
                main(args);
                break;
            case 4:
                System.out.println("End!!! Bye!!!");
                System.exit(0);
                break;
            default:
                System.out.println("Something went wrong try again\n\n");
                main(args);
                break;
        }
    }
}