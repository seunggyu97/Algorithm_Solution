//class Solution{
//    public int solution(String s) {
//        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i<s.length(); ){
//            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
//                sb.append(s.charAt(i++));
//            }else{
//                for(int j = 0; j<10; j++){
//                    if(s.startsWith(word[j],i)){
//                        sb.append(j);
//                        i += word[j].length();
//                        break;
//                    }
//                }
//            }
//        }
//
//        return Integer.parseInt(sb.toString());
//    }
//    public static void main(String[] args){
//        String s = "one4seveneight";
//        Solution sol = new Solution();
//
//        System.out.println(sol.solution(s));
//    }
//}