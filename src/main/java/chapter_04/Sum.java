package chapter_04;

import java.util.Arrays;

/**
 *  Рекурсивное вычисление суммы элементов массива
 *  Arrays.copyOfRange - мы создаем более маленький массив
 */
public class Sum {
    private static int sum(int [] array) {
        if (array.length == 0) {
            return 0;
        } else return array[0] + sum(Arrays.copyOfRange(array, 1, array.length));
    }

    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};
        System.out.println(sum(array)); //15
    }
}