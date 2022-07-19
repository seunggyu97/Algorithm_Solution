package Java.Programmers.Lv2;

import java.util.Arrays;
import java.util.Comparator;

class BiggestNumber{
    public String biggestNumber(int[] numbers){
        String[] res = new String[numbers.length];

        for(int i = 0; i<numbers.length;i++){
            res[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(res, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return ((o2 + o1).compareTo(o1+o2));
            }
        });

        if(res[0].equals("0")){
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for(String str : res){
            sb.append(str);
        }

        return sb.toString();
    }

    public static void main(String[] args){
        int[] numbers = {6, 10, 2};
        BiggestNumber sol = new BiggestNumber();

        System.out.println(sol.biggestNumber(numbers));
    }
}
