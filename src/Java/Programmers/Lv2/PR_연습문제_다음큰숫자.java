package Java.Programmers.Lv2;

class NextBigNum{
    public int nextBigNum(int n){
        int count = checkNum(n);

        for(int i = n + 1;;i++){
            if(checkNum(i) == count) return i;
        }
    }

    public int checkNum(int n){
        int count = 0;
        String binary = Integer.toBinaryString(n);
        for(int i = 0; i < binary.length(); i++){
            if(binary.charAt(i) == '1') count++;
        }

        return count;
    }

    public static void main(String[] args){
        int n = 78;
        NextBigNum sol = new NextBigNum();

        System.out.println(sol.nextBigNum(n));
    }
}
