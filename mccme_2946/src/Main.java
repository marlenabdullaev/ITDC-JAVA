import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = n / 60 % 24;
        int b = n % 60;
        System.out.printf("%d %d", a, b);
    }
}
