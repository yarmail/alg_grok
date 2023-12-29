package chapter_04;

import java.util.Arrays;

/**
 *  Второй вариан реализации быстрой сортировки
 *  (больше методов)
 *  Делается "логирование" печать шагов
 */
public class Quick2 {
    public static void main(String[] args) {
        int [] array = new int [] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        System.out.println(arrayToString(array));
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] arr, int from, int to) {
        // если в подмассиве один элемент, то сортировать его не надо
        if (from < to) {
            int divideIndex = partition(arr, from, to); //divideIndex - разделитель, опорный элемент
            printSortStep(arr, from, to, divideIndex);
            quickSort(arr, from, divideIndex -1);
            quickSort(arr, divideIndex, to);
        }
    }

    /**
     *  алгорит деления массива на два подмассива
     */
    private static int partition(int[] arr, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;

        int pivot = arr[from];// выбирается опорный элемент, в данном случае первый
        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] < pivot) {
                leftIndex++; // левая граница двигается направо
            }
            while (arr[rightIndex] > pivot) {
                rightIndex--; // правая граница двигается налево
            }
            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex); // производим взаимо замену элементов, если нарушается ><
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    /**
     * замена 2-х элементов местами
     */
    private static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length ; i++) {
            if (i > 0 ) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    private static void printSortStep(int[] arr, int from, int to, int partitionIndex) {
        System.out.print(arrayToString(arr));
        System.out.print("\npartition at index: " + partitionIndex);
        System.out.print(", left: " + arrayToString(Arrays.copyOfRange(arr, from, partitionIndex)));
        System.out.println(", right: " + arrayToString(Arrays.copyOfRange(arr, partitionIndex, to + 1)) + "\n");
    }





}
