package Day33;

import java.util.Arrays;

public class QuickSort {

    public void sort(int arr[], int low, int high) {

        if (low < high) {

            int pivot = partition(arr, low, high);

            sort(arr, low, pivot - 1);
            sort(arr, pivot + 1, high);
        }
    }

    public int partition(int arr[], int low, int high) {

        int pivot = low;
        int i = low;
        int j = high;

        while (i < j) {

            while (i <= high && arr[i] <= arr[pivot]) {
                i++;
            }

            while (j >= low && arr[j] > arr[pivot]) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[pivot];
        arr[pivot] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void main(String[] args) {

        int arr[] = {7, 2, 1, 6, 8, 5, 3, 4};

        QuickSort q = new QuickSort();

        q.sort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}