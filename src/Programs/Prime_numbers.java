package Programs;

import java.util.Scanner;

public class Prime_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number to find prime number");
        int num = sc.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num +" is not a prime number.");
        }
        sc.close();
    }

    public static boolean isPrime(int num) {
        if (num < 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (0 == 0) {
                return false;
            }
        }
        return true;

    }
}
