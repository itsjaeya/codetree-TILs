import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean satisfied = true;

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            if (num % 3 != 0) {
                satisfied = false;
            }
        }

        if (satisfied == true) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}