package chapter_04;

import java.util.Arrays;

/**
 *  Реализация алгоритма сортировки QuickSort
 *  (с использованием рекурсии)
 *  Первый вариант - меньше количество методов, но больше кода в них
 *
 *  План
 *  1. Из массива выбирается некоторый опорный элемент.
 *  (Довольно часто опорный элемент выбирается в середине)
 *  2. Перекладываем все элементы влево, либо вправо от опорного элемента
 *  Тем самым массив разбивается на 2 части:
 *  - не отсортированные элементы слева от опорного элемента;
 *  - не отсортированные элементы справа от опорного элемента
 *  3. Чтобы отсортировать эти 2 меньших подмассива, алгоритм
 *  рекурсивно вызывает сам себя
 */
public class Quick1 {
    public static void main(String[] args) {
        int[] array = {1, 54, -8, 0, 71, 12, 7, 6, 12, -3, 72};
        quickSort(array, 0, array.length-1);
        Arrays.stream(array).forEach(System.out::println);
    }

    private static void quickSort(int[] array, int leftIndex, int rightIndex) {
        // Выход из рекурсии - завершить, если массив пуст или уже нечего делить
        if (array.length == 0 || leftIndex >= rightIndex) return;

        // 1. выбираем опорный элемент - pivot
        int pivot = array[(leftIndex + rightIndex) / 2];
        int leftMarkerIndex = leftIndex; // маркер отслеживающий положение каретки слева до опорного элемента
        int rightMarkerIndex = rightIndex; // маркер отслеживающий положение каретки справа до опорного элемента

        while (leftMarkerIndex <= rightMarkerIndex) {
            // 2. Перекладываем все элементы вправо влево от опорного элемента
            // Двигаем левый маркер слева направо, если элемент меньше, чем pivot
            while (array[leftMarkerIndex]< pivot) leftMarkerIndex++;
            // Двигаем правый маркер справа налево, если элемент больше, чем pivot
            while (array[rightMarkerIndex]> pivot) rightMarkerIndex--;
            // Если все неправильно и левый элемент > pivot, а правый < pivot меняем их местами
            if (leftMarkerIndex <= rightMarkerIndex) {
                int swap = array[leftMarkerIndex];
                array[leftMarkerIndex] = array[rightMarkerIndex];
                array[rightMarkerIndex] = swap;
                // сдвигаем маркеры, чтобы получить новые границы
                leftMarkerIndex++;
                rightMarkerIndex--;
            }
        }
        //3. рекурсия для сортиртировки левой и правой части
        // Если у нас есть левый подмассив (от начала до правого маркера, пришедшего в середину)
        if (leftIndex < rightMarkerIndex) quickSort(array, leftIndex, rightMarkerIndex);
        // Если у нас есть правый подмассив (от конца до левого маркера пришедшего в середину)
        if (rightIndex > leftMarkerIndex) quickSort(array, leftMarkerIndex, rightIndex);

    }

}
