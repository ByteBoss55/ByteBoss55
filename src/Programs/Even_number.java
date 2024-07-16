package Programs;

import java.util.Scanner;

public class Even_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = scan.nextInt();
        if(a % 2 ==0){
            System.out.println(a+" is the ever number");
        }else {
            System.out.println(a+" is not a even number.");
        }
    }
}
