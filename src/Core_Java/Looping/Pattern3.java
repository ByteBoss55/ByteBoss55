package Core_Java.Looping;

public class Pattern3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}
 /*
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
            1 2 3 4
            1 2 3
            1 2
            1
        */