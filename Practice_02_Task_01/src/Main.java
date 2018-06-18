import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение стороны a: ");
        int sideA = scanner.nextInt();

        System.out.print("Введите значение стороны b: ");
        int sideB;
        sideB = scanner.nextInt();

        System.out.print("Введите значение стороны c: ");
        int sideC = scanner.nextInt();

        int volume = sideA * sideB * sideC;
        // вычитание -
        // деление /
        // остаток от деления %
        //

        System.out.printf("Объем параллелепипеда (%d x %d x %d) равен: %d\n", sideA, sideB, sideC, volume);

    }
}
