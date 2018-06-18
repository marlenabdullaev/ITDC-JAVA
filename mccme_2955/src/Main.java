import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = n / 100;
        int b = n % 10 * 10 + n / 10 % 10;
        int c = a - b +1;
        System.out.print(c);
        }
}
