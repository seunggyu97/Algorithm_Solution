package Java.Programmers.Lv2;

import java.util.Arrays;
import java.util.HashSet;

class EnglishShiritori{
    public int[] englishShiritori(int n, String[] words){
        int rotation = 1;
        int sequence = 1;
        boolean flag = false;
        HashSet<String> hs = new HashSet<>();

        hs.add(words[0]);
        for(int i = 1; i < words.length; i++){
            if(sequence == n) {
                sequence = 1;
                rotation++;
            }
            else sequence++;

            if(!hs.contains(words[i]) && words[i-1].charAt(words[i-1].length()-1) == words[i].charAt(0)){
                hs.add(words[i]);
            }else{
                flag = true;
                break;
            }
        }
        if(!flag){
            return new int[]{0, 0};
        }
        return new int[]{sequence, rotation};
    }

    public static void main(String[] args){
        int n = 5;
        String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};

        EnglishShiritori sol = new EnglishShiritori();
        System.out.println(Arrays.toString(sol.englishShiritori(n, words)));
    }
}