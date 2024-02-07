import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num = sc.nextInt();
            if (num < 25) {
                System.out.println("Higher");
                continue;
            } else if (num > 25) {
                System.out.println("Lower");
                continue;
            } else {
                System.out.println("Good");
                break;
            }
        }
    }
}