package com.company;

//Сложность n2
public class BubbleSort {

    int[] GetSortArrayIncreases( int... arr ) {
        for (int i = arr.length - 1; i >= 1; i--) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int v = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = v;
                }
            }
        }
        return arr;
    }

    int[] GetSortArrayDecrease( int... arr ) {
        for (int i = arr.length - 1; i >= 1; i--) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int v = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = v;
                }
            }
        }
        return arr;
    }
}
