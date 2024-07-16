package Core_Java.Looping;

public class Prime_Numbers {
    public static void main(String[] args) {

                int start = 1; // starting point of range
                int end = 50; // ending point of range

                System.out.println("Prime numbers between " + start + " and " + end + " are:");

                for (int i = start; i <= end; i++) {
                    if (isPrime(i)) {
                        System.out.print(i + " ");
                    }
                }
            }

            public static boolean isPrime(int num) {
                // Handle edge cases
                if (num <= 1) {
                    return false;
                }
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        }



