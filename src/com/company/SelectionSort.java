package com.company;

//Сложность n2
public class SelectionSort {

    int[] GetSortArrayIncreases( int... arr ){
        return GetSortArrayIncreases( arr.length, arr );
    }

    int[] GetSortArrayIncreases( int count,int... arr ){
        int[] arr_new = new int[count];

        for (int i = 0; i < count; i++) {
            int k = i;
            int v = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (v > arr[j]) {
                    k = j;
                    v = arr[j];
                }
            }
            arr_new[i] = arr[k];
            arr[k] = arr[i];
            arr[i] = v;
        }
        return arr_new;
    }

    int[] GetSortArrayDecrease( int... arr ){
        return GetSortArrayDecrease( arr.length, arr );
    }

    int[] GetSortArrayDecrease( int count,int... arr ){
        int[] arr_new = new int[count];
        for (int i = 0; i < count; i++) {
            int k = i;
            int v = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (v < arr[j]) {
                    k = j;
                    v = arr[j];
                }
            }
            arr_new[i] = arr[k];
            arr[k] = arr[i];
            arr[i] = v;
        }
        return arr_new;
    }
}
