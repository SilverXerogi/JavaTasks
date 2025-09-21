package task1_hangman;

import java.util.*;

public class HangmanGame {
    private static final String[] WORDS = {"java", "computer", "hangman", "developer", "program"};
    private static final int MAX_LIVES = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String word = WORDS[rand.nextInt(WORDS.length)];
        Set<Character> guessedLetters = new HashSet<>();
        int lives = MAX_LIVES;

        System.out.println("Добро пожаловать в игру Виселица!");

        while (lives > 0) {

            StringBuilder display = new StringBuilder();
            boolean allGuessed = true;
            for (char c : word.toCharArray()) {
                if (guessedLetters.contains(c)) {
                    display.append(c).append(" ");
                } else {
                    display.append("_ ");
                    allGuessed = false;
                }
            }

            System.out.println("Слово: " + display);
            System.out.println("Осталось жизней: " + lives);

            if (allGuessed) {
                System.out.println("Поздравляем! Вы угадали слово: " + word);
                break;
            }

            System.out.print("Введите букву: ");
            String input = scanner.nextLine().toLowerCase();
            if (input.length() != 1) {
                System.out.println("Введите только одну букву.");
                continue;
            }

            char guess = input.charAt(0);
            if (word.contains(String.valueOf(guess))) {
                guessedLetters.add(guess);
                System.out.println("Правильно!");
            } else {
                lives--;
                System.out.println("Неверно!");
            }
        }

        if (lives == 0) {
            System.out.println("Вы проиграли. Загаданное слово было: " + word);
        }
    }
}
