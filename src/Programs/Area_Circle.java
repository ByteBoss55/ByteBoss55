package Programs;

import java.util.Scanner;

public class Area_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle :");
        double r = sc.nextDouble();
        System.out.println("Area of Circle :"+r*r*3.14);
    }

}
