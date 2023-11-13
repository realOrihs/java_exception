package exception;

public class CustomException extends Exception {

    public CustomException(String message) {
        super(message);
    }

    public static void demonstrateException(boolean throwException) throws CustomException {
        if (throwException) {
            throw new CustomException("Пример собственного исключения");
        } else {
            System.out.println("Без исключения");
        }
    }
}
