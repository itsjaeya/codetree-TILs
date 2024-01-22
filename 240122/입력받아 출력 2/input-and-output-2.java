import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        int first = sc.nextInt();
        int last = sc.nextInt();

        String firstWord = Integer.toString(first);
        String lastWord = Integer.toString(last);

        System.out.println(firstWord + lastWord);
    }
}