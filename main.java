import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение x:");
        double x = scanner.nextDouble();

        double a = 2; // произвольное значение параметра a
        double b = 3; // произвольное значение параметра b

        double y;

        if (x >= 2) {
            y = Math.sqrt(1 + x * Math.sqrt(a * x));
        } else {
            y = a * Math.sin(b * x) + 3;
        }

        System.out.println("Результат вычисления функции y = f(x): " + y);
    }
}
