public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int temp = 0;

        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }
}