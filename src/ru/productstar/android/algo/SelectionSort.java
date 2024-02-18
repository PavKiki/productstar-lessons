package ru.productstar.android.algo;

public class SelectionSort {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            var index = i;
            
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] <= array[index]) {
                    index = j;
                }
            }
            
            var temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
}
