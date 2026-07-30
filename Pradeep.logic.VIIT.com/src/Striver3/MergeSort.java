package Striver3;

import java.util.ArrayList;

public class MergeSort {
	ArrayList<Integer> lst = new ArrayList<Integer>();

	public void sort(int arr[], int low, int high) {

		if (low <= high) {
			int mid = (arr.length) / 2;
			sort(arr, low, mid);
			sort(arr, mid + 1, high);
			merge(arr, low, mid, high);

		}

		System.out.println(lst);

	}

	public void merge(int[] arr, int low, int mid, int high) {

		int left = low;
		int right = mid + 1;

		while (left <= mid && right <= high) {
			if (arr[left] < arr[right]) {
				lst.add(left);
				left++;
			} else {
				lst.add(right);
				right++;
			}
		}
	}

	public static void main(String[] args) {
		MergeSort m = new MergeSort();
		int arr[] = { 2, 5, 3, 4, 7, 8, 9, 1 };
		int left = arr[0];
		int right = arr[arr.length + 1];
		m.sort(arr, left, right);

	}

}
