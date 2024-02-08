import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;
        int x = 0;

        while (true) {
            k *= 2;
            x++;
            if (k == n) {
                System.out.println(x);
                break;
            }
        }
    }
}