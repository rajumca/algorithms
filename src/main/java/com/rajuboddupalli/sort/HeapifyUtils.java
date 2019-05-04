package com.rajuboddupalli.sort;

public class HeapifyUtils {
    public static int counter;

    public static void heapify(int[] arr, int n, int heapPosition) {
        counter++;
        int largest = heapPosition;
        int left = 2 * heapPosition + 1;
        int right = 2 * heapPosition + 2;
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }


        if (largest != heapPosition) {
            int temp = arr[largest];
            arr[largest] = arr[heapPosition];
            arr[heapPosition] = temp;

            heapify(arr, n, largest);
        }

    }

}
