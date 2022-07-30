package Java.Programmers.Lv2;

class NumberExpression{
    public int numberExpression(int n){
        int count = 1;

        for(int i = 1; i <= n/2+1; i++){
            int p = i;
            int sum = p;

            while(sum <= n){
                p++;
                sum += p;
                if(sum == n){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        int n = 15;
        NumberExpression sol = new NumberExpression();

        System.out.println(sol.numberExpression(n));
    }
}
