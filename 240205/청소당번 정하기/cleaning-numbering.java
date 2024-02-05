import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cntClass = 0;
        int cntHallway = 0;
        int cntBathroom = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i % 3 != 0 && i % 12 != 0) {
                cntClass++;
            } else if (i % 2 != 0 && i % 3 == 0 && i % 12 != 0) {
                cntHallway++;
            } else if (i % 2 != 0 && i % 3 != 0 && i % 12 == 0) {
                cntBathroom++;
            } else if (i % 6 == 0 && i % 12 != 0) {
                cntHallway++;
            } else if (i % 12 == 0) {
                cntBathroom++;
            }
        }

        System.out.println(cntClass + " " + cntHallway + " " + cntBathroom);
    }
}