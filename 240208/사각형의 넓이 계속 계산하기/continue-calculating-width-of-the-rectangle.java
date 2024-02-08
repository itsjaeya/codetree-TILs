import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int width = sc.nextInt();
            int length = sc.nextInt();
            char c = sc.next().charAt(0);

            if (c == 'C') {
                System.out.println(width * length);
                break;
            } else {
                System.out.println(width * length);
                continue;
            }
        }

    }
}