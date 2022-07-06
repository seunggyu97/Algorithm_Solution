//import java.util.Arrays;
//import java.util.Comparator;
//
//class Solution{
//    public String[] solution(String[] strings, int n){
//        String[] answer = new String[strings.length];
//
//        Arrays.sort(strings, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if(o1.charAt(1) != o2.charAt(1)){
//                    return Math.min((int)o1.charAt(1), (int)o2.charAt(1));
//                }
//                else{
//
//                }
//            }
//        })
//    }
//
//    public static void main(String[] args){
//        String[] strings = {"sun", "bed", "car"};
//        int n = 1;
//        Solution sol = new Solution();
//
//        System.out.println(Arrays.toString(sol.solution(strings, n)));
//    }
//}