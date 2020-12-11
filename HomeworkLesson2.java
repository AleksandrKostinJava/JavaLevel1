package homework.lesson2;
import java.util.Arrays;

public class HomeworkLesson2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        changeZeroToOne(arr);
        int[] arr2 = new int[8];
        fillPlusThreeNumbers(arr2);
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1, -2};
        multiplyLessSixByThree(arr3);
        int[][] arr4 = new int[10][10];
        fillDiagonallyByOne(arr4);
        int[] arr5 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1, -2, -3, 55};
        minMax(arr5);
        int[] arr6 = {1, 1, 1, 2, 1};
        System.out.println(checkBalance(arr6));
    }

    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */

    private static int[] changeZeroToOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        return arr;
    }

    /**
     * 2. Задать пустой целочисленный массив размером 8.
     * С помощью цикла заполнить его значениями
     * 0 3 6 9 12 15 18 21; +3 к следующему элементу
     */

    private static int[] fillPlusThreeNumbers(int[] arr) {
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number;
            number += 3;
        }
        return arr;
    }

    /**
     * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
     * пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */

    private static int[] multiplyLessSixByThree(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        return arr;
    }

    /**
     * 4. Создать квадратный двумерный целочисленный массив
     * (количество строк и столбцов одинаковое) и с помощью
     * цикла(-ов) заполнить его диагональные элементы единицами;
     */

    private static int[][] fillDiagonallyByOne(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }
//        для диагонали с обратной стороны
//        for (int i = 0; i < arr.length; i++) {
//            arr[i][arr.length - 1 - i] = 1;
//        }
//   вывести в консоль
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        return arr;
    }

    /**
     * 5. ** Задать одномерный массив и найти в нем
     * минимальный и максимальный элементы (без помощи интернета);
     */

    private static void minMax(int[] arr) {
        int max = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        // тяжеловесное решение, но зато без интернета и с задачей справляется )
//          Arrays.sort(arr);
//          min = arr[0];
//          max = arr[arr.length-1];
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }

    /**
     * 6. ** Написать метод, в который передается не пустой
     * одномерный целочисленный массив, метод должен вернуть true,
     * если в массиве есть место, в котором сумма левой
     * и правой части массива равны.
     */

    private static boolean checkBalance(int[] arr) {
        int overallSum = 0;
        int leftSum = 0;
        // чтобы посчитать без лишних вычислений,
        // нужно отнимать от полной суммы
        for (int i = 0; i < arr.length; i++) {
            overallSum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            if (overallSum - leftSum == 0) {
                return true;
            }
        }
        return false;
    }
}

