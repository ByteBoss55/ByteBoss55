package Core_Java;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter any number");
//        int num = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        int numb = 10;
//        System.out.println(num1+"");
//        System.out.println(num2+"");
        for (int i =0;i<numb;i++){
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
//            System.out.println(num3+"");
        }
    }

}
