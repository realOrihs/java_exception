package exception;

public class First {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }

        try {
            accessToUnexistingElement();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }

        try {
            playWithNullPointer();
        } catch (NullPointerException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }

        try {
            tryToCreateFunnyArray();
        } catch (NegativeArraySizeException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }

        try {
            searchSomethingOutString();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }

        System.out.println("Ура! Меня снова печают");
    }

    public static void divideByZero() {
        int a = 777 / (666 - 666);
    }

    public static void accessToUnexistingElement() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < arr.length + 1; i++) {
            System.out.printf("%d,", i);
        }
    }

    public static void playWithNullPointer() {
        String importantData = null;
        System.out.println("important is " + importantData);
    }

    public static void tryToCreateFunnyArray() {
        int i[] = new int[-5];
    }

    public static void searchSomethingOutString() {
        String secret = "Пин-код от карты: 123";
        secret.charAt(22);
    }
}
