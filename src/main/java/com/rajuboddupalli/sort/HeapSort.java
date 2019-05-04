package com.rajuboddupalli.sort;

import static com.rajuboddupalli.common.ArrayPrint.print;
import static com.rajuboddupalli.sort.HeapifyUtils.counter;
import static com.rajuboddupalli.sort.HeapifyUtils.heapify;

public class HeapSort {

    public static void sort(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for(int i=n-1;i>=0;i--){

            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr, i, 0);
        }

    }

    public static void main(String[] args) {
        int[] arr = {15, 23, 6, 9, 16, 11, 13, 8, 10, 29, 14, 22, 21,7,12};
        counter=0;
        sort(arr, arr.length);
        print(arr);
        System.out.println("counter: "+counter);

    }

}
