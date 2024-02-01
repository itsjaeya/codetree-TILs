import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char cold1 = sc.next().charAt(0);
        int temp1 = sc.nextInt();
        char cold2 = sc.next().charAt(0);
        int temp2 = sc.nextInt();
        char cold3 = sc.next().charAt(0);
        int temp3 = sc.nextInt();
        int cnt = 0;

        if (cold1 == 'Y' && temp1 >= 37) {
            cnt++;
        }
        if (cold2 == 'Y' && temp2 >= 37) {
            cnt++;
        }
        if (cold3 == 'Y' && temp3 >= 37) {
            cnt++;
        }

        if (cnt >= 2) {
            System.out.println("E");
        } else {
            System.out.println("N");
        }
    }
}