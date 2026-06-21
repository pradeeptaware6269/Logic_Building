package Day3Task;


import java.util.Scanner;

public class Task2 {
// here we are simply reverse the array
	public static void main(String[] args) {
		int arr[] = { 5, 4, 3, 2, 1 };
		System.out.println("| ");
		for (int i = arr.length - 1; i >= 0; i--) {
			
			System.out.print(arr[i] + " , ");
		}
		System.out.print(" | ");
	}

}
