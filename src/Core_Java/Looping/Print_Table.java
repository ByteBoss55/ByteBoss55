package Core_Java.Looping;

public class Print_Table {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;
        int range = 10;
        for (int i = start; i<= end; i++ ){
            print(i,range);
            System.out.println();
        }
    }

    public static void print(int number, int range) {
        System.out.println("Multiplication table for "+number+":");
        for (int i = 1; i<=range;i++){
            System.out.println(number+"x"+i+"="+(number * i));
        }
    }
}
