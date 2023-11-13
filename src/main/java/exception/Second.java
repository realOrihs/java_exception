package exception;

public class Second extends CustomException {

    public Second(String message) {
        super(message);
    }

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }

        try {
            createPositiveObject(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }

        try {
            manipulateString(null);
        } catch (NullPointerException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }

        try {
            demonstrateException(true);
        } catch (CustomException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }

        try {
            demonstrateException(false);
        } catch (CustomException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }
    }

    public static void divideByZero() {
        // Пример деления на ноль
        double result = 5.0 / 0;
    }

    public static void createPositiveObject(int value) {
        // Пример ограничения на положительные числа
        if (value <= 0) {
            throw new IllegalArgumentException("Значение должно быть положительным");
        }
    }

    public static void manipulateString(String str) {
        // Пример обращения к методу объекта, который равен null
        int length = str.length();
    }
}
