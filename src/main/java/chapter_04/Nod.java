package chapter_04;
/*
Нахождение НОД - наибольшего общего делителя для двух чисел
В разной документации ещё применяются аббревиатуры HCF или GCD
Где-то ещё упоминается как алгоритм Евклида

 */
public class Nod {
    public static int findNOD (int a, int b) {
        while (b != 0) {
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(findNOD(12, 16)); //4
    }
}