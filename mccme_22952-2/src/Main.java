import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        //int days = (int) Math.ceil((m - 1) / n) + 1;
        int days = (m / n +(m % n + n - 1) / n);
        System.out.print(days);
    }
}