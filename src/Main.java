import java.util.Scanner;

/* class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();

            System.out.print("Введите операцию (+, -, *, /, ^): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();

            double result = calculate(num1, operator, num2);
            System.out.println("Результат: " + result);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }

    public static double calculate(double num1, char operator, double num2) throws InvalidInputException, ArithmeticException {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("Деление на ноль недопустимо");
                }
                return num1 / num2;
            case '^':
                if (num1 == 0 && num2 < 0) {
                    throw new InvalidInputException("Ноль не может быть возведен в отрицательную степень.");
                }
                return Math.pow(num1, num2);
            default:
                throw new IllegalArgumentException("Недопустимая операция");
        }
    }
} /*

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}


 /*  Пароль должен быть не менее 8 символов.
 Пароль должен содержать хотя бы одну цифру.
 Пароль должен содержать хотя бы одну заглавную букву.
 Метод должен выбрасывать исключение, если пароль не соответствует какому-либо из этих правил.*/
class PasswordVerifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        String password = scanner.next();
        if (password.length() < 8) throw new RuntimeException("Длина пароля меньше 8 символов");

        boolean hasDigits = false;
        for (int i = 0; i < password.length() && !hasDigits; i++) {
            if (Character.isDigit(password.charAt(i))) {
                hasDigits = true;
            }
        }
        if(!hasDigits) throw new RuntimeException("Пароль должен содержать хотя бы одну цифру");

        boolean hasUpperCase = false;
        char[] pasArray = password.toCharArray();
        for(char x:pasArray) {
            if (Character.isUpperCase(x)) {
                hasUpperCase = true;
                break;
            }
        }
        if(!hasUpperCase) throw new RuntimeException("Пароль должен содержать хотя бы одну заглавную букву");
    }
}