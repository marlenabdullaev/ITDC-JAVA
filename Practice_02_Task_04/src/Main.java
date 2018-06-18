import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите значение в дюймах? ");
            double lengthInInches =scanner.nextDouble();
            double lengthInSm = lengthInInches * 2.54;

            System.out.printf("%.2f дюйм. = %.2f см.", lengthInInches, lengthInSm);
        }
}

