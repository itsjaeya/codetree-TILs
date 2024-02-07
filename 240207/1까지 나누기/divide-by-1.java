import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int divCnt = 0;
        int num = n;
        
        for (int i = 1; i <= n; i++) {
            num = num / i;
            divCnt++;
            if (num <= 1) {
                System.out.println(divCnt);
                break;
            }
        }
    }
}