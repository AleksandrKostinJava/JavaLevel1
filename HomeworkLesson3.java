package homework.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkLesson3 {

    /**
     * 1. Написать программу, которая загадывает случайное
     * число от 0 до 9 и пользователю дается 3 попытки
     * угадать это число. При каждой попытке компьютер
     * должен сообщить, больше ли указанное пользователем число,
     * чем загаданное, или меньше. После победы или проигрыша выводится
     * запрос – «Повторить игру еще раз?
     * 1 – да / 0 – нет»(1 – повторить, 0 – нет).
     */

    private static final int number = (int) (Math.random() * 10);

    public static void main(String[] args) {
        // guessTheNumber();
        // guessTheWord();
    }

    private static void guessTheNumber() {
        System.out.println("Я загадал число от 0 до 9. Попробуй угадать");
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            int passedNumber = scanner.nextInt();
            if (passedNumber == number) {
                System.out.println("Вы угадали число");
                break;
            } else {
                if (number > passedNumber) {
                    System.out.println("Загаданное число больше");
                }
                if (number < passedNumber) {
                    System.out.println("Загаданное число меньше");
                }
            }
        }
        System.out.println("Повторить игру еще раз? " +
                " * 1 – да / 0 – нет");
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextInt() == 1) {
            guessTheNumber();
        }
    }

    /**
     * При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
     * сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь.
     * Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
     * apple – загаданное
     * apricot - ответ игрока
     * ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
     * Для сравнения двух слов посимвольно можно пользоваться:
     * String str = "apple";
     * char a = str.charAt(0); - метод вернет char, который стоит в слове str на первой позиции
     * Играем до тех пор, пока игрок не отгадает слово.
     * Используем только маленькие буквы.
     */

    private static void guessTheWord() {
        String[] words = new String[]{"apple", "orange", "lemon",
                "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String computerWord = words[(int) (Math.random() * words.length)];
        char[] out = createCharArray();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Я загадал слово, попробуй отгадать");
        while (true) {
            String humanWord = scanner.next();
            if (humanWord.length() == 1) {
                System.out.println("Введи слово, а не букву");
                continue;
            }
            if (!humanWord.equals(computerWord)) {
                if (humanWord.length() > out.length || humanWord.length() > computerWord.length()) {
                    System.out.println("Слово слишком длинное, попробуй другое");
                    continue;
                }
                for (int i = 0; i < humanWord.length(); i++) {
                    if (humanWord.charAt(i) == computerWord.charAt(i)) {
                        out[i] = computerWord.charAt(i);

                    }
                }
                System.out.println("Ты не угадал. Попробуй еще раз. Подсказка:");
                System.out.println(Arrays.toString(out));

            } else if (humanWord.equals(computerWord)) {
                System.out.println("Вы угадали слово");
                break;
            }
        }
    }

    private static char[] createCharArray() {
        char[] out = new char[15];
        for (int i = 0; i < out.length; i++) {
            out[i] = '#';
        }
        return out;
    }

}
