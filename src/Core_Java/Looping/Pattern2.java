package Core_Java.Looping;

public class Pattern2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == j) {
                    System.out.print(1+" ");
                } else {
                    System.out.print(0+" ");
                }

            }
            System.out.println(" ");
        }
    }
}
/*
          1 0 1
          0 1 0
          0 0 1
    */