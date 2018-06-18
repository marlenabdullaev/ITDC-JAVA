import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        long firstNumber = scanner.nextLong(); // int

        System.out.print("Введите второе число: ");
        long secondNumber = scanner.nextLong();

        long sum = firstNumber + secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);

        System.out.printf("%d + %d = %d\n", firstNumber, secondNumber, sum);
    }
}