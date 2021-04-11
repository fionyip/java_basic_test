// Given an array of numbers. Write a function to sort the numbers.
//You can use any Sorting Algorithm like Bubble Sort, Quick Sort and etc.

import java.util.Random;
import java.util.Arrays;


//Bubble Sort
public class sortNumber {
    public static void main(String[] args)
    {
        Random random = new Random();
        int[] array = random.ints(10,0,10).toArray();
        System.out.println("Origin array");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++){
                if (array[j] > array[j + 1]) {
                    int largerNum = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = largerNum;
                }
            }
        }
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(array));
    }

}
