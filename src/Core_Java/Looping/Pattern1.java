package Core_Java.Looping;

public class Pattern1 {
    public static void main(String[] args) {

        int rows = 3;
        int cols = 3;
        int num = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
/*  1 2 3
    4 5 6
    7 8 9
 */