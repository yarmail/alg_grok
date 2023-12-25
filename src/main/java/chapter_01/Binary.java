package chapter_01;

/**
 *
 * int[] sortedArray - отсортированный (!) массив
 * int valueToFind - искомый элемент (значение)
 * int low - нижняя граница массива (индекс)
 * int high - верхняя граница массива(индекс)
 * int mid - середина массива (индекс)
 * guess - значение элемента массива
 * index - индекс искомого элемента
 * return должно вернуть индекс найденного элемента
 */
public class Binary {
    private static Integer binarySearch(int[] sortedArray, int valueToFind) {
        int low = 0;
        int high = sortedArray.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int guess = sortedArray[mid];
            if (guess < valueToFind) {
                low = mid + 1;
            } else  if (guess > valueToFind) {
                high = mid - 1;
            } else if (guess == valueToFind) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] values = {1, 1, 2, 2, 2, 3};
        int valueToFind = 3;
        int index = binarySearch(values, valueToFind);
        System.out.println(index); // индекс = 5
    }
}
/* Примечания
int mid = low + (high - low) / 2; лучше использовать чем
int mid = (high + low) / 2; чтобы избежать переполнения int

 */