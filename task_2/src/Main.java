import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос на ввод первой строки
        System.out.print("Введите первую строку (a): ");
        String a = scanner.nextLine();

        // Запрос на ввод второй строки
        System.out.print("Введите вторую строку (b): ");
        String b = scanner.nextLine();

        // Сравнение строк и вывод результата
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        scanner.close();
    }
}