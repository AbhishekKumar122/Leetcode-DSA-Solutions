package Arrays;

public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxPro = 0;

        for (int i = 1; i < prices.length; i++) {
            maxPro = Math.max(maxPro, prices[i] - minPrice);
            minPrice = Math.min(prices[i], minPrice);
        }
        return maxPro;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int resultDay = maxProfit(prices);

        System.out.println(resultDay);
    }
}
