import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a % 10;
        int c = (a % 100) / 10;
        int d = (a % 1000) / 100;
        int e = b + c + d;
        System.out.print(e);
    }
}
