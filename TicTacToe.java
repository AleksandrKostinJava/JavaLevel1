package homework.lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        start();
    }

    static void start() {
        char[][] field = createField();

        while (true) {
            printField(field);
            doPlayerMove(field);
            if (checkWin(field, 'X')) {
                System.out.println("Вы выиграли");
                break;
            }
            if (checkDraw(field)) {
                System.out.println("Ничья");
                break;
            }

            doAIMove(field);
            if (checkWin(field, 'O')) {
                System.out.println("Компьютер выиграл");
                break;
            }
            if (checkDraw(field)) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    static boolean checkDraw(char[][] field) {
        int freeCells = field.length * field.length;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] != '-') {
                    freeCells--;
                }
            }
        }

        return freeCells == 0;
    }

    /**
     * 2. Переделать проверку победы, чтобы она не была реализована
     * просто набором условий, например, с использованием циклов.
     * 3. * Попробовать переписать логику проверки победы,
     * чтобы она работала для поля 5х5 и количества фишек 4.
     * Очень желательно не делать это просто набором условий
     * для каждой из возможных ситуаций;
     */
    //PS Очень старался вынести повторющийся блок кода в отдельный метод,
    // но не смог это сделать, логически пока не получается додумать как
    //можно изменять переменные в методе, чтобы он работал для разных линий
    // (и прямые и диагонали) и считал правильно для всех ситуаций

    static boolean checkWin(char[][] field, char sign) {
        int     horizontal = 0, vertical = 0,
                diagonal = 0, reverseDiagonal = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == sign) {
                    horizontal++;
                } else horizontal = 0;
                if (horizontal == field.length - 1) {
                    return true;
                }
                if (field[j][i] == sign) {
                    vertical++;
                } else vertical = 0;
                if (vertical == field.length - 1) {
                    return true;
                }
            }
            if (field[i][i] == sign) {
                diagonal++;
            } else diagonal = 0;
            if (diagonal == field.length - 1) {
                return true;
            }

            if (field[i][field.length - 1 - i] == sign) {
                reverseDiagonal++;
            } else reverseDiagonal = 0;
            if (reverseDiagonal == field.length - 1) {
                return true;
            }
        }
        return false;
    }

    static void doPlayerMove(char[][] field) {
        int x, y;

        do {
            x = chooseCoordinate(field.length, 'y');
            y = chooseCoordinate(field.length, 'x');
        } while (field[x][y] != '-');

        field[x][y] = 'X';

        printField(field);
        printSeparator();
    }

    static void doAIMove(char[][] field) {
        /**4. *** Доработать искусственный интеллект,
         * чтобы он мог блокировать ходы игрока.*/
        //PS Такое же примечание, как и к предыдущему заданию

        int     horizontal = 0, vertical = 0,
                diagonal = 0, reverseDiagonal = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == 'X') {
                    horizontal++;
                } else horizontal = 0;
                if (horizontal == field.length - 2) {
                    field[i][j + 1] = 'O';
                }
                if (field[j][i] == 'X') {
                    vertical++;
                } else vertical = 0;
                if (vertical == field.length - 2) {
                    field[j + 1][i] = 'O';
                }
            }
            if (field[i][i] == 'X') {
                diagonal++;
            } else diagonal = 0;
            if (diagonal == field.length - 2) {
                field[i + 1][i + 1] = 'O';
            }

            if (field[i][field.length - 1 - i] == 'X') {
                reverseDiagonal++;
            } else reverseDiagonal = 0;
            if (reverseDiagonal == field.length - 1) {
                field[i + 1][field.length - i] = 'O';
            }
        }

        Random random = new Random();
        int x, y;

        do {
            x = random.nextInt(field.length);
            y = random.nextInt(field.length);
        } while (field[x][y] != '-');

        field[x][y] = 'O';
        printField(field);
        printSeparator();
    }

    static int chooseCoordinate(int maxLength, char sign) {
        Scanner scanner = new Scanner(System.in);

        int coord;
        do {
            System.out.printf("Введи место для крестика, %s-координата от 1 до 5%n", sign);
            coord = scanner.nextInt() - 1;
        } while (coord < 0 || coord >= maxLength);

        return coord;
    }

    static char[][] createField() {
        return new char[][]{
                {'-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-'}
        };
    }

    static void printSeparator() {
        for (int i = 0; i < 2; i++) {
            System.out.println();
        }
    }

    static void printField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
}