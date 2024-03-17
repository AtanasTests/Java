package loops;

import java.util.Scanner;


/**
 * To read 2 numbers from the keyboard A and B. To display them all
 * numbers from A to B to the power of 2 (separated by commas). If any number is a multiple of 3, yes
 * a message is displayed that the number is being skipped "skip 3". If the sum of all
 * displayed numbers (not including the omitted ones) becomes greater than 200, to terminate
 * the output.
 */
public class Task8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A:");
        int a = sc.nextInt();

        System.out.println("Enter B:");
        int b = sc.nextInt();

        if(a > b) {
            int buf = b;
            b = a;
            a = buf;
        }

        int sum = 0;
        for (int i = a; i <= b; i++) {
            if(i % 3 != 0) {
                System.out.print(i*i);
                sum += i*i;
            } else {
                System.out.print("skip " + i);
            }
            if(sum > 200)
                break;
            if(i != b)
                System.out.print(", ");
        }
    }
}
