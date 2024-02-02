import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int value = a / b;
        int remain = a % b;

        System.out.print(value + ".");

        for (int i = 0; i < 20; i++) {
            remain *= 10;
            value = remain / b;
            remain = remain % b;
            System.out.print(value);
        }
    }
}