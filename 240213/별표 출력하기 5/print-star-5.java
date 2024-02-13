import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int k = 0; k < n; k++) {
            for (int i = 0; i < n - k; i++) {
                for (int j = 0; j < n - k; j++) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}