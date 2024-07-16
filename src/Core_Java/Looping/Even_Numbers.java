package Core_Java.Looping;

public class Even_Numbers {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("The even number range of 1 to 30 are ");
        for (i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
