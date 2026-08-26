package Day42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> lst = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {

            if (lst.isEmpty() ||
                lst.get(lst.size() - 1)[1] < intervals[i][0]) {

                lst.add(new int[] {
                    intervals[i][0],
                    intervals[i][1]
                });

            } else {

                lst.get(lst.size() - 1)[1] =
                    Math.max(
                        lst.get(lst.size() - 1)[1],
                        intervals[i][1]
                    );
            }
        }

        return lst.toArray(new int[lst.size()][]);
    }

    public static void main(String[] args) {

        int arr[][] = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        Task5 t = new Task5();

        int[][] result = t.merge(arr);

        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}