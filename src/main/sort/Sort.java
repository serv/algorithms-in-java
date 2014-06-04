package main.sort;

import java.util.Random;

public class Sort {
    static final int COUNT = 10;
    
    
    public static double[] unsortedDouble() {
        Random r = new Random();
        double[] array = new double[COUNT];
        double rangeMin = 0.0;
        double rangeMax = 100000.0;
        
        for (int i = 0; i < COUNT; i++) {                
            array[i] = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        }
        
        return array;
    }
    
    public static int[] unsortedInt() {
        Random r = new Random();
        int[] array = new int[COUNT];
        int rangeMin = 0;
        int rangeMax = 100000;
        
        for (int i = 0; i < COUNT; i++) {
            array[i] = rangeMin + (rangeMax - rangeMin) * r.nextInt();
        }
        
        return array;
    }
    
    public static boolean isSortedDouble(double[] array) {
        if (array.length < 2) {
            return true;
        }

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i+1]) {
                return false;
            }
        }
        
        return true;
    }
    
    public static boolean isSortedInt(int[] array) {
        if (array.length < 2) {
            return true;
        }
        
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i+1]) {
                return false;
            }
        }
        
        return true;
    }
    
    /*
     * Selection sort
     * Find the smallest element
     * Swap with the element in the beginning
     */
    
    public static double[] selectionDouble(double[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            
            double temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        
        return array;
    }
    
    public static int[] selectionInt(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        
        return array;
    }
}
