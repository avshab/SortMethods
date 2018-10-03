package com.company;

public class Main {
    static void PrintArray(int... arr){
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] +" ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {15, 4, 8, 8, 0, 8, 3, -6};
        int[] arr1 = {8, 78, 11, -8, 0, -8, 3, -6};
        int[] arr2 = {1, 7, 0, 8, 12, 5, 3, -6};
        int[] arr3 = {1, -7, 12, 8, 6, -5, 3, -6};
        int[] arr4 = {9, -7, 5, 16, 11, -8, 3, -6};
        int[] arr5 = {-9, 23, -15, 6, 9, 1, -5, 16};

        SelectionSort s  = new SelectionSort();

        PrintArray(s.GetSortArrayIncreases(arr));
        PrintArray(s.GetSortArrayIncreases(4, arr));
        PrintArray(s.GetSortArrayDecrease(arr1));
        PrintArray(s.GetSortArrayDecrease(4, arr));


        InsertionSort s2 = new InsertionSort();

        PrintArray(s2.GetSortArrayIncreases(arr2));
        PrintArray(s2.GetSortArrayDecrease(arr3));

        BubbleSort s3 = new BubbleSort();
        PrintArray(s3.GetSortArrayIncreases(arr4));
        PrintArray(s3.GetSortArrayDecrease(arr5));
    }
}
