import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Как вас зовут?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next(); // nextline();

        System.out.println("Привет, " + name + "!");
        System.out.printf("Привет, %s! %s\n", name, "Hello!");
        System.out.format("Привет, %s!\n", name);
    }
}
