package Java.Programmers.Lv2;

class ExpectedDraw {
    public int expectedDraw(int n, int a, int b){
        int answer = 1;
        int big = Math.max(a, b);
        int small = Math.min(a, b);
        while(true){
            if(big-small == 1 && big%2 == 0){
                break;
            }
            big = divide(big);
            small = divide(small);
            answer++;
        }
        return answer;
    }

    public int divide(int num){
        if(num % 2 == 0) return num/2;
        else return (num+1)/2;
    }
    public static void main(String[] args){
        int n = 8;
        int a = 4;
        int b = 7;

        ExpectedDraw sol = new ExpectedDraw();
        System.out.println(sol.expectedDraw(n, a, b));
    }
}
