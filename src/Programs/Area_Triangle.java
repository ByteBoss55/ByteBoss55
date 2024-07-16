package Programs;

import java.util.Scanner;

public class Area_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of triangle :");
        double B = sc.nextDouble();
        System.out.println("Enter the height of triangle :");
        double H = sc.nextDouble();
        System.out.println("Area of the is triangle :"+0.5*B*H);
    }
}
