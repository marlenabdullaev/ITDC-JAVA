public class Main {
    public static void main(String[] args) {
        //В этом варианте много операций
        System.out.println("**************");
        System.out.println("*Привет, Мир!*");
        System.out.println("**************");
        //Этот вариант слишком длинный
        System.out.println("**************\n" + "*Привет, Мир!*\n" + "**************");
        //Оптимальный вариант - операцию конкатенации
                System.out.println(
                "**************\n" +
                "*Привет, Мир!*\n" +
                "**************"
        );
    }
}
