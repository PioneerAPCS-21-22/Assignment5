/**
 * Babylonian Square Root program.
 *
 * @author Mr. King
 * @version 8/31/2021
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Square root of what number? ");
        double n = in.nextDouble();
        System.out.print("Make a guess: ");
        double x0 = in.nextDouble();
        double x1 = (x0 + n / x0) / 2;
        x0 = x1;
        x1 = (x0 + n / x0) / 2;
        x0 = x1;
        x1 = (x0 + n / x0) / 2;
        x0 = x1;
        x1 = (x0 + n / x0) / 2;
        System.out.println("The square root of " + n + " is approximately " + x1);
    }
}

