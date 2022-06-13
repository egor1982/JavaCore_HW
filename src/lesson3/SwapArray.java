package lesson3;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {

        Integer[] intArr = {1, 2, 3, 4, 5};
        swapGenerics(intArr, 0,2);
        String[] strArr = {"Каждый", "Охотник", "Желает", "Знать"};
        swapGenerics(strArr, 3, 0);
    }

    public static <T> void swapGenerics(T[] arr, int i, int j) {
        if ((i < 0 || i >= arr.length) || (j < 0 || j >= arr.length)) {
            return;
        }
        System.out.println(Arrays.toString(arr));

        System.out.printf("элементы с индексом [%s] и [%s] поменялись местами\n", i, j);
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
}
