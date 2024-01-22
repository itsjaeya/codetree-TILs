import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        String num = sc.next();
        int xxxx = sc.nextInt();
        int yyyy = sc.nextInt();

        String xxxxWord = Integer.toString(xxxx);
        String yyyyWord = Integer.toString(yyyy);
        System.out.println(num + "-" + yyyyWord + "-" + xxxxWord);

    }
}