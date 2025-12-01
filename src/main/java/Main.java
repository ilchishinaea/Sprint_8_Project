
public class Main {
    public static void main(String[] args) {

        Account acc = new Account("Тимотей Шевроле");

        boolean isValid = acc.checkNameToEmboss();
        System.out.println("Результат проверки: " + isValid);
    }
}