//import java.util.HashMap;
//
//class Solution{
//    public boolean solution(String s){
//        HashMap<Character, Integer> hashMap = new HashMap<>();
//
//        for(int i = 0; i< s.length(); i++){
//            char c = s.charAt(i);
//            if(c == 'p' || c == 'P'){
//                hashMap.put('p', hashMap.getOrDefault('p',0) + 1);
//            }
//            else if(c == 'y' || c=='Y'){
//                hashMap.put('y', hashMap.getOrDefault('y',0) + 1);
//            }
//        }
//
//        return (hashMap.get('p') == hashMap.get('y'));
//    }
//
//    public static void main(String[] args){
//        String s = "pPoooyY";
//        Solution sol = new Solution();
//
//        System.out.println(sol.solution(s));
//    }
//}