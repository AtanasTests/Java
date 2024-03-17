package primitive.types;

import java.util.Scanner;


/**
 * Enter 2 different integer numbers from the console. Write down their sum,
 * difference, product, remainder of division, and integer division into separates
 * variables and print those results to the console. Try the same with numbers
 * floating point.
 */

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter num2: ");
        int num2 = scanner.nextInt();

        int sumInt = num1 + num2;
        System.out.println("Sum: " + sumInt);

        int differenceInt = num1 - num2;
        System.out.println("Difference: " + differenceInt);

        int productInt = num1 * num2;
        System.out.println("Product: " + productInt);

        int remainderInt = num1 % num2;
        System.out.println("Remainder: " + remainderInt);

        int quotientInt = num1 / num2;
        System.out.println("Integer Division: " + quotientInt);


        System.out.print("Enter Floating num3: ");
        float num3 = scanner.nextFloat();

        System.out.print("Enter Floating num4: ");
        float num4 = scanner.nextFloat();


        float sumF = num3 + num4;
        System.out.println("Sum: " + sumF);

        float differenceF = num3 - num4;
        System.out.println("Difference: " + differenceF);

        float productF = num3 * num4;
        System.out.println("Product: " + productF);

        float remainderF = num3 % num4;
        System.out.println("Remainder: " + remainderF);

        float quotientF = num3 / num4;
        System.out.println("Floating-Point Division: " + quotientF);


    }
}
