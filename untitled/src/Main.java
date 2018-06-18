import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите минимальное значение? ");
        int min = scanner.nextInt();

        System.out.print("Введите максимальное значение? ");
        int max = scanner.nextInt();
        double a = Math.random();
        System.out.printf("Случайно число от %d до %d: %f\n", min, max, a);
    }
}
