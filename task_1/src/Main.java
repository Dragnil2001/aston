import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос на ввод первого числа
        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();

        // Запрос на ввод второго числа
        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();

        // Сравнение чисел и вывод результата
        if (a > b) {
            System.out.println("a > b : " + a + " > " + b);
        } else if (a < b) {
            System.out.println("a < b : " + a + " < " + b);
        } else {
            System.out.println("a = b : " + a + " = " + b);
        }

        // Выполнение арифметических операций и вывод результатов
        int sum = a + b;
        int difference = a - b;
        int multiplication = a * b;
        double quotient = b != 0 ? (double) a / b : Double.NaN; // Проверка на деление на ноль

        System.out.println("Сложение: " + a + " + " + b + " = " + sum);
        System.out.println("Вычитание: " + a + " - " + b + " = " + difference);
        System.out.println("Умножение: " + a + " * " + b + " = " + multiplication);
        if (b != 0) {
            System.out.println("Деление: " + a + " / " + b + " = " + quotient);
        } else {
            System.out.println("Деление: " + a + " / " + b + " = Ошибка (деление на ноль)");
        }

        scanner.close();
    }
}