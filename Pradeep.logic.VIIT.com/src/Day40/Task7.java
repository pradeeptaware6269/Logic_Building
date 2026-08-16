package Day40;

import java.util.Arrays;

public class Task7 {

    public int[][] matrix(int arr[][]) {

        int row = arr.length;
        int col = arr[0].length;

        // Find zeroes and mark their row and column
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (arr[i][j] == 0) {
                    mark_row(arr, i);
                    mark_col(arr, j);
                }
            }
        }

        return arr;
    }

    public void mark_row(int arr[][], int i) {

        for (int j = 0; j < arr[0].length; j++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
    }

    public void mark_col(int arr[][], int j) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
    }

    public static void main(String[] args) {

        int arr[][] = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        Task7 t = new Task7();

        t.matrix(arr);

        // Convert all -1 to 0
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }

        System.out.println(Arrays.deepToString(arr));
    }
}