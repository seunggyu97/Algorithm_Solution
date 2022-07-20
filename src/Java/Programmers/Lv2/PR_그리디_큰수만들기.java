package Java.Programmers.Lv2;

class MakeBigNumbers{
    public String makeBigNumbers(String number, int k){
        StringBuilder sb = new StringBuilder();
        int idx = 0, max;

        for(int i = 0; i < number.length() - k; i++){
            max = 0;
            for(int j = idx + 1; j <= k + i; j++){
                if(max < number.charAt(j)-'0') {
                    max = number.charAt(j) - '0';
                    idx = j;
                }
            }
            sb.append(max);
        }

        return sb.toString();
    }
    public static void main(String[] args){
        String number = "1231234";
        int k = 3;

        MakeBigNumbers sol = new MakeBigNumbers();
        System.out.println(sol.makeBigNumbers(number, k));
    }
}