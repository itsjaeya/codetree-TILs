import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num >= 0 && num <= 200) {
                sum += num;
                cnt++;
            }
        }

        double avg = (double) sum / cnt;

        System.out.printf(sum + " %.1f", avg);
    }
}