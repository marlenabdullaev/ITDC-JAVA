import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int t = scanner.nextInt();
        int b = (v * t) % 109;
        int a = (b + 109) % 109;
        System.out.print(a);
    }
}
