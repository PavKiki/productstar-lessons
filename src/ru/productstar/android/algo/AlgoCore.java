package ru.productstar.android.algo;

import java.util.Arrays;

public class AlgoCore {
    public static void main(String[] args) {
        var array = AlgoUtil.generateArray(100000);
        
//        System.out.print("Array before sorting: ");
//        AlgoUtil.outputArray(array);
        
        var qsArray = Arrays.copyOf(array, array.length);
        System.out.println(  "Time of quick sorting algo: " 
                           + AlgoUtil.measureTime(qsArray, QuickSort::sort));
//        AlgoUtil.outputArray(qsArray);
        
        var selArray = Arrays.copyOf(array, array.length);
        System.out.println(  "Time of selection sorting algo: " 
                           + AlgoUtil.measureTime(selArray, SelectionSort::sort));
//        AlgoUtil.outputArray(selArray);
        
        System.out.println(  "Time of java.util sorting algo: " 
                           + AlgoUtil.measureTime(array, Arrays::sort));
//        AlgoUtil.outputArray(array);
    }
}
