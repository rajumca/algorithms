package com.rajuboddupalli.sort;

import static com.rajuboddupalli.sort.HeapifyUtils.counter;
import static com.rajuboddupalli.sort.HeapifyUtils.heapify;

public class TopKElements {
    public static void main(String[] args) {
        int[] arr = {15, 23, 6, 9, 16, 11, 13, 8, 10, 29, 14, 22, 21, 7, 12};
        HeapifyUtils.counter=0;
       printTopKElements(arr, 10);
        System.out.println("count"+counter);
    }

    public static void printTopKElements(int[] arr,int k) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        System.out.println("count-inyt"+counter);
        for(int i=n-1;i>=n-k;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            System.out.print(arr[i]+" ");
           heapify(arr, i, 0);
        }
        System.out.println();
    }
}
