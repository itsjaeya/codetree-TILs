import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int medium = a;

        if ((a < b && b < c) || (c < b && b < a)) {
            medium = b;
        } else if ((a < c && c < b) || (b < c && c < a)) {
            medium = c;
        }

        System.out.println(medium);
    }
}