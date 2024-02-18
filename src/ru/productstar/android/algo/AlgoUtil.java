package ru.productstar.android.algo;

import java.util.Random;
import java.util.function.Consumer;

public class AlgoUtil {
    public static int[] generateArray(int size) {
        var random = new Random();
        
        var result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = random.nextInt();
        }
        
        return result;
    }
    
    public static long measureTime(int[] array, Consumer<int[]> sortingAlgorithm) {
        long start, end;
        
        start = System.currentTimeMillis();
        sortingAlgorithm.accept(array);
        end = System.currentTimeMillis();
        
        return end - start;
    }
    
    public static void outputArray(int[] array) {
        var sb = new StringBuilder();
        sb.append('[');
        
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i] + ", ");
        }
        
        var length = sb.length();
        sb.replace(length - 2, length, "]");
        
        System.out.println(sb.toString());
    }
}
