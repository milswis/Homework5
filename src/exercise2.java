import java.util.Scanner;

public class exercise2 {

    public static double f(double x, double a, double b) {
        if (x >= 0 && x < 5) {
            return Math.cos(x);
        } else if (x == 5) {
            double sqrtExpr = a * x - b;
            if (sqrtExpr > 0) {
                return 1 / Math.sqrt(sqrtExpr);
            } else {
                throw new ArithmeticException("Подкоренное выражение отрицательное. Невозможно вычислить корень.");
            }
        } else if (x > 5 && x <= 8) {
            return b * Math.pow(x, 2) + 3 * x - 2;
        } else {
            throw new IllegalArgumentException("Значение x должно быть в пределах [0, 8].");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите значение b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        try {
            double result = f(x, a, b);
            System.out.printf("f(%.2f) = %.5f%n", x, result);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        scanner.close();
    }
}
