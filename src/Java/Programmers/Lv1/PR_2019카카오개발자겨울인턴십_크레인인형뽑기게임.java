//package Java;
//
//import java.util.Stack;
//
//class Solution{
//    public int solution(int[][] board, int[] moves){
//        int result = 0;
//        Stack<Integer> basket = new Stack<>();
//        Stack<Integer>[] stack = new Stack[board[0].length];
//        for(int i=0; i<board[0].length; i++){
//            stack[i] = new Stack<Integer>();
//        }
//        for(int i = board.length-1; i>=0; i--){
//            for(int j = 0; j<board[0].length; j++){
//
//                if(board[i][j] != 0) {
//                    stack[j].push(board[i][j]);
//                }
//            }
//        }
//        for(int i : moves){
//
//            if(stack[i-1].isEmpty()) continue;
//            int tmp = -1;
//            if(!basket.isEmpty()) tmp = basket.peek();
//            if (tmp != stack[i - 1].peek()) {
//                basket.push(stack[i - 1].pop());
//            } else {
//                basket.pop();
//                stack[i - 1].pop();
//                result += 2;
//            }
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args){
//        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
//        int[] moves = {1,5,3,5,1,2,1,4};
//
//        Solution sol = new Solution();
//        System.out.println(sol.solution(board, moves));
//    }
//}
