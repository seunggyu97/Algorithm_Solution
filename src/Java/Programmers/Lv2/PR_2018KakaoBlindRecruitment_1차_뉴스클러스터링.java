package Java.Programmers.Lv2;

import java.util.ArrayList;

class NewsClustering{
    public int newsClustering(String str1, String str2){

        ArrayList<String> strArr1 = separate(str1.toUpperCase());
        ArrayList<String> strArr2 = separate(str2.toUpperCase());
        int inter = 0, union = 0;

        if(strArr1.size() == 0 && strArr2.size() == 0) return 65536;
        for(String s : strArr1){
            if(strArr2.remove(s)) inter++;
            union++;
        }
        union += strArr2.size();

        double jaccard = (double)inter/(double)union;
        return (int) (jaccard*65536);
    }

    public ArrayList<String> separate(String str){
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i = 0; i < str.length()-1; i++){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i+1);
            if(ch1 >= 'A' && ch1 <= 'Z' && ch2 >= 'A' && ch2 <= 'Z'){
                arrayList.add(ch1 + String.valueOf(ch2));
            }
        }

        return arrayList;
    }
    public static void main(String[] args){
        String str1 = "aa1+aa2";
        String str2 = "AAAA12";

        NewsClustering sol = new NewsClustering();
        System.out.println(sol.newsClustering(str1, str2));
    }
}
