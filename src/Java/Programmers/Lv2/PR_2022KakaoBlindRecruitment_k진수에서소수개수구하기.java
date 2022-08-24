package Java.Programmers.Lv2;

class PrimeCount{
    public boolean isPrime(long n){
        if(n <= 1) return false;

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public int primeCount(int n, int k){
        String convertNum = Integer.toString(n, k);
        String[] arr = convertNum.split("0");
        int answer = 0;

        for(String s : arr){
            if(s.equals("")) continue;
            if(isPrime(Long.parseLong(s))) answer++;
        }

        return answer;
    }

    public static void main(String[] args){
        int n = 110011;
        int k = 10;

        PrimeCount sol = new PrimeCount();
        System.out.println(sol.primeCount(n, k));
    }
}
