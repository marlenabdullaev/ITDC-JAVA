import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = a + 1;
        int c = a - 1;

        System.out.printf("The next number for the number %d is %d.\n", a, b);
        System.out.printf("The previous number for the number %d is %d.\n", a, c);

    }
}
