import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a % 100;
        int c = b / 10;
        System.out.print(c);
    }
}
