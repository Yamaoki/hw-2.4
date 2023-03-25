public class Main {
    public static void main(String[] args) {
        boolean result = Validator.validate("andrei", "summer", "summer");
        if (result) {
            System.out.println("Логин и пароль корректные");
        }
    }
}