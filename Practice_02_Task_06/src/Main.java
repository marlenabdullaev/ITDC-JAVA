import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите минимальное значение? ");
        int min = scanner.nextInt();

        System.out.print("Введите максимальное значение? ");
        int max = scanner.nextInt();

        int random = (int) (Math.random() * (max-min + 1) + min);

        System.out.printf("Случайно число от %d до %d: %d\n", min, max, random);
        }
}
