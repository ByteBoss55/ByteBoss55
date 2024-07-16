package Programs;

import java.util.Scanner;

public class Greatest_Number {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        a = sc.nextInt();
        System.out.println("Enter the second number :");
        b = sc.nextInt();
        System.out.println("Enter the third number :");
        c = sc.nextInt();


        if(a>b){
            if(a>c){
                System.out.println(a+"is a greater number");
            }
        }if(b>c){
            if(b>a){
                System.out.println(b+"is a greater number");
            }
        }if(c>a){
            if(c>b){
                System.out.println(c+"is a greater number");
            }
        }
    }
}
