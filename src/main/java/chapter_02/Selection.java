package chapter_02;

/**
 * Сортировка выбором
 * План действий
 * 1. Разбиваем массив на отсортированную и неотсортированную части.
 * 2. Находим в неотсортированной части минимальный элемент.
 * 3. Меняем его местами с тем элементом, который находится
 * на нулевой позиции — в конец отсортированного массива.
 * 4. Далее находим следующий по величине элемент и меняем его
 * с элементом на первой позиции, etc., пока не закончатся
 * неотсортированные значения.
 */
public class Selection {
    public static void selectionSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {12, 6, 4, 1, 15, 10};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (", ")); // 1, 4, 6, 10, 12, 15,
        }
    }
}
