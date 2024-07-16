package Programs;

import java.util.Scanner;

public class Compound_Interest {
    public static void main(String[] args) {
        //        A = P (1+r/n)^nt
//        P = principal
//        r = rate of interest
//        n = number of times interest is compounded per year
//        t = time (in years)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal :");
        double P = sc.nextDouble();
        System.out.println("Enter the rate of interest :");
        double r = sc.nextDouble();
        System.out.println("Enter the number of time's interest is compound per year :");
        double n = sc.nextDouble();
        System.out.println("Enter the time duration :");
        double t = sc.nextDouble();
        double result =Math.pow(1+(r/n),n*t);
        System.out.println("The Compound interest is "+P*(result));
    }
}
