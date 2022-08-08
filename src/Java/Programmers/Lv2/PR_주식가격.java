package Java.Programmers.Lv2;

import java.util.Arrays;

class StockPrice {
    public int[] stockPrice(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                answer[i] += 1;
                if (prices[i] > prices[j]) {
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        int[] prices = {1, 2, 3, 2, 3};
        StockPrice sol = new StockPrice();

        System.out.println(Arrays.toString(sol.stockPrice(prices)));
    }
}