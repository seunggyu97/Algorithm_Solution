package Java.Programmers.Lv1;

class Decimal{
    public int decimal(int[] nums){
        int count = 0;
        for(int i = 0; i<nums.length-2; i++){
            for(int j = i+1; j<nums.length-1; j++){
                for(int k = j+1; k<nums.length; k++){
                    if(isPrime(nums[i]+nums[j]+nums[k])){
                        count++;
                    }
                }
            }
        }

        return count;
    }
    public boolean isPrime(int num){
        if(num == 2) return true;
        for(int i = 2; i<=Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        Decimal sol = new Decimal();

        System.out.println(sol.decimal(nums));
    }
}
