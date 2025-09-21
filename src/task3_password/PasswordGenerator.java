package task3_password;

import java.util.*;

public class PasswordGenerator {
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()-_=+<>?";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину пароля (от 8 до 12): ");
        int length = scanner.nextInt();

        if (length < 8 || length > 12) {
            System.out.println("Неверная длина. Будет выбран размер 10.");
            length = 10;
        }

        String allChars = UPPER + LOWER + DIGITS + SYMBOLS;
        Random rand = new Random();
        StringBuilder password = new StringBuilder();


        password.append(UPPER.charAt(rand.nextInt(UPPER.length())));
        password.append(LOWER.charAt(rand.nextInt(LOWER.length())));
        password.append(DIGITS.charAt(rand.nextInt(DIGITS.length())));
        password.append(SYMBOLS.charAt(rand.nextInt(SYMBOLS.length())));


        for (int i = 4; i < length; i++) {
            password.append(allChars.charAt(rand.nextInt(allChars.length())));
        }

        List<Character> chars = new ArrayList<>();
        for (char c : password.toString().toCharArray()) {
            chars.add(c);
        }
        Collections.shuffle(chars);

        StringBuilder finalPassword = new StringBuilder();
        for (char c : chars) {
            finalPassword.append(c);
        }

        System.out.println("Сгенерированный пароль: " + finalPassword);
    }
}
