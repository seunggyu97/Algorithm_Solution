//class Solution{
//    public int solution(int[] arr){
//        int max = 0;
//        int count = 1;
//        int compare = 0;
//        boolean finish = false;
//        for(int i : arr){
//            if(i > max) max = i;
//        }
//        while(true){
//            compare = max * count;
//            count ++;
//            for(int i = 0; i<arr.length; i++){
//                if(compare % arr[i] != 0){
//                    break;
//                }
//                if(i == arr.length-1){
//                    finish = true;
//                }
//            }
//            if(finish) break;
//        }
//
//        return compare;
//    }
//
//    public static void main(String[] args){
//        int[] arr = {2,6,8,14};
//        Solution sol = new Solution();
//
//        System.out.println(sol.solution(arr));
//    }
//}