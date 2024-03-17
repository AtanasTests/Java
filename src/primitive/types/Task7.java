package primitive.types;

import java.util.Scanner;


/**
 * Enter 3 variables from the keyboard – time (integer type), amount of money (number
 * floating point), am I healthy - boolean type. Compose a program that
 * makes decisions based on this data in the following way: - if I'm sick, I won't go out - if I have money, I'll buy medicine - if I don't - I'll stay at home and drink tea - if I'm healthy - if I have less than BGN 10 i will go for coffee etc
 * Display the resulting solution as a console message.
 */

public class Task7 {

    public static void main(String[] args) {

        int time;
        double money;
        boolean isHealthy;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter time:");
        time = sc.nextInt();

        System.out.println("Enter money:");
        money = sc.nextDouble();

        System.out.println("Are you ok?");
        isHealthy = sc.nextBoolean();

        if (!isHealthy) {
            System.out.println("I'm sick. I won't go out.");
            if (money > 0 && time > 9) {
                System.out.println("I have money. I'll buy medicine.");
            } else {
                System.out.println("I don't have money. I'll stay at home and drink tea.");
            }
        } else {
            if (isHealthy) {
                System.out.println("I'm healthy.");

                if (money < 10 && time < 9) {
                    System.out.println("I have less than BGN 10. I'll go for coffee.");
                } else {
                    System.out.println("I'll take a walk in the park");
                }
            }
        }
    }
}
