import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int diff = a -b;
        int rh = h - a;
        int d = (1 + rh / diff + (rh % diff + diff - 1) / diff);
        System.out.print(d);
    }
}
