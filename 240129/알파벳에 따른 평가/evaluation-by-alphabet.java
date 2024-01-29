import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letter = sc.next().charAt(0);

        if (letter == 'S') {
            System.out.println("Syperior");
        } else if (letter == 'A') {
            System.out.println("Excellent");
        } else if (letter == 'B') {
            System.out.println("Good");
        } else if (letter == 'C') {
            System.out.println("Usually");
        } else if (letter == 'D') {
            System.out.println("Effort");
        } else {
            System.out.println("Failure");
        }
    }
}