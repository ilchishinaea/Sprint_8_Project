public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        return !name.isEmpty()                                  // строка не пустая
                && !name.startsWith(" ") && !name.endsWith(" ") // нет пробелов в начале и конце
                && name.contains(" ")                            // есть пробел
                && name.indexOf(" ") == name.lastIndexOf(" ")   // ровно один пробел
                && name.length() > 2 && name.length() < 20;    // длина от 3 до 19 символов
    }
}
