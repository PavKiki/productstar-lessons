package ru.productstar.android.algo;

public class QuickSort {
    public static void sort(int[] array) {
        recursive(0, array.length - 1, array);
    }
    
    private static void recursive(int low, int high, int[] array) {
        if (low >= high || array.length == 0) {
            return;
        }
        
        var partition = low + (high - low)/2;
        var leg = array[partition];
        var i = low;
        var j = high;
        
        while (i <= j) {
            while (leg > array[i]) {
                i++;
            }
            
            while (leg < array[j]) {
                j--;
            }
            
            if (i <= j) {
                var temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        
        if (low < j) {
            recursive(low, j, array);
        }
        if (high > i) {
            recursive(i, high, array);
        }
    }
}
