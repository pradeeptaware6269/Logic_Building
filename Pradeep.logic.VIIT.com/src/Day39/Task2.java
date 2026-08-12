package Day39;

public class Task2 {
	public int maxProfit(int[] prices) {

		int n = prices.length;
		int profit = 0;
		int cost = 0;
		int mini = prices[0];
		for (int i = 1; i < n; i++) {
			cost = prices[i] - mini;
			profit = Math.max(profit, cost);
			mini = Math.min(mini, prices[i]);

		}
		return profit;

	}

	public static void main(String[] args) {
		Task2 t = new Task2();
		int arr[] = { 7, 1, 5, 3, 6, 4 };

		System.out.println(t.maxProfit(arr));
	}
}
