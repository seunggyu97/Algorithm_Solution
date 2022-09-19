package Java.Programmers.Lv2;

import java.util.Arrays;

class RepeatBinaryTransform{
    int zeroRemove = 0;
    int rotation = 1;
    public int[] repeatBinaryTransform(String s){
        recursive(s);

        return new int[]{rotation, zeroRemove};
    }

    public void recursive(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '0') {
                zeroRemove++;
                continue;
            }
            sb.append('1');
        }
        String binary = Integer.toBinaryString(sb.length());
        if (!binary.equals("1")) {
            rotation++;
            recursive(binary);
        }
    }

    public static void main(String[] args){
        String s = "110010101001";
        RepeatBinaryTransform sol = new RepeatBinaryTransform();

        System.out.println(Arrays.toString(sol.repeatBinaryTransform(s)));
    }
}
