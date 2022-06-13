//class Solution{
//    public long solution(int price, int money, int count){
//        long totalMoney = 0;
//        for(int i = 1; i<=count; i++){
//            totalMoney += i*price;
//        }
//        return totalMoney-money <= 0 ? 0 : totalMoney-money;
//    }
//
//    public static void main(String[] args){
//        int price = 3;
//        int money = 20;
//        int count = 4;
//
//        Solution sol = new Solution();
//
//        System.out.println(sol.solution(price, money, count));
//    }
//}