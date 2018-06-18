import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int seconds = n % 60;
        int minutes = n / 60 % 60;
        int hours = n / 60 / 60 % 24;
        System.out.printf("%d:%02d:%02d", hours, minutes, seconds);
    }
}
