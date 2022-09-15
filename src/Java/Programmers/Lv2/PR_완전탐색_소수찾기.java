package Java.Programmers.Lv2;

import java.util.HashSet;
import java.util.Iterator;

class FindPrimeNumber{
    HashSet<Integer> hs = new HashSet<>();

    public void recursive(String comb, String other){
        if(!comb.equals(""))
            hs.add(Integer.valueOf(comb));

        for(int i = 0; i<other.length(); i++)
            recursive(comb+other.charAt(i), other.substring(0,i) + other.substring(i+1));
    }
    public boolean isPrime(int num){
        if(num == 0 || num == 1) return false;
        int sqrt = (int)Math.sqrt(num);

        for(int i = 2; i <= sqrt; i++){
            if(num % i == 0) return false;
        }

        return true;
    }
    public int findPrimeNumber(String numbers){
        int count = 0;
        recursive("", numbers);

        Iterator<Integer> it = hs.iterator();
        while(it.hasNext()) {
            int num = it.next();
            if(isPrime(num))
                count++;
        }
        return count;
    }
    public static void main(String[] args){
        String numbers = "17";

        FindPrimeNumber sol = new FindPrimeNumber();
        System.out.println(sol.findPrimeNumber(numbers));
    }
}
