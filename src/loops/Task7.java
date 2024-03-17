package loops;

import java.util.Scanner;


/**
 * Starting at 3, display the first n divisible numbers on the screen
 * of 3. The numbers should be separated by commas.
 */
public class Task7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        int counter = 0;
        for (int i = 3; true ; i++) {
            if (i == 3) {
                System.out.print(i);
                counter++;
            } else if (i % 3 == 0) {
                System.out.print("," + i);
                counter++;
            }

            if (counter == n) {
                break;
            }
        }
    }
}
