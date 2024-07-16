package Programs;

import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Weight in Kg :");
        double W = sc.nextDouble();
        System.out.println("Enter the Height in Cm :");
        double H = sc.nextDouble();
        double BMI = W/(H*H);
        if(BMI<=18.5){
            System.out.println("You are underweight");
        } else if (BMI>=18.5 && BMI<=24.9) {
            System.out.println("You are have a normal weight");
        } else if (BMI>=25 && BMI<=29.9) {
            System.out.println("You are overweight");
        } else if (BMI>=30 && BMI<=34.9) {
            System.out.println("You are obesity");
        }else {
            System.out.println("No data found");
        }

    }
}
