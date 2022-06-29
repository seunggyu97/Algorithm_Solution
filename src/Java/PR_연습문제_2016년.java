package Java;

class Solution{
    public String solution(int a, int b){
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int count = 0;

        for(int i = 1; i<a; i++){
            count += month[i];
        }
        count += b;
        return day[(count+4)%7];
    }

    public static void main(String[] args){
        int a = 5;
        int b = 24;

        Solution sol = new Solution();
        System.out.println(sol.solution(a, b));
    }
}
