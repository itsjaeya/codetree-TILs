import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"John", "Tom", "Paul", "Sam"};

        while (true) {
            int num = sc.nextInt();
            if (num - 1 == 0) {
                System.out.println("John");
                continue;
            } else if (num - 1 == 1) {
                System.out.println("Tom");
                continue;
            } else if (num - 1 == 2) {
                System.out.println("Paul");
                continue;
            } else if (num - 1 == 3) {
                System.out.println("Sam");
                continue;
            } else {
                System.out.println("Vacancy");
                break;
            }
        }
    }
}