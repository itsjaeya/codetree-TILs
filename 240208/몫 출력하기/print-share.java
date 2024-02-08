import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        while (true) {
            int num = sc.nextInt();
            
            if (num % 2 == 1) {
                continue;
            } else {
                int result = num / 2;
                System.out.println(result);
                cnt++;
                if (cnt == 3) {
                    break;
                }
            }
        }
    }
}