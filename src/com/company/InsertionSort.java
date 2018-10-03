package com.company;
;

//Сортировка вставками имеет сложность n2, количество сравнений вычисляется по формуле n*(n-1)/2
public class InsertionSort {

    int[] GetSortArrayIncreases( int... arr ){
        for (int i = 1; i < arr.length ; i++) {
            int el = arr[i];
            int pos = i - 1;
            while(pos >= 0 && arr[pos] > el){
                arr[pos+1] = arr[pos];
                pos--;
            }
            arr[pos+1] = el;
        }
        return arr;

    }


    int[] GetSortArrayDecrease( int... arr ){
        for (int i = 1; i < arr.length; i++) {
            int el = arr[i];
            int pos = i - 1;
            while(pos >= 0 && arr[pos] < el){
                arr[pos+1] = arr[pos];
                pos--;
            }
            arr[pos+1] = el;
        }
        return arr;
    }
}
