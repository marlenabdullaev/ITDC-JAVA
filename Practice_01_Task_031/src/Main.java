import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Как вас зовут?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine(); // nextline();
        System.out.println("Привет, " + name + ".");
    }
}
