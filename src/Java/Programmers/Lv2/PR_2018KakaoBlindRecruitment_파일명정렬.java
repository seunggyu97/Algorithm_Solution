package Java.Programmers.Lv2;

import java.util.Arrays;
import java.util.Comparator;

class SortFileName {
    public String[] sortFileName(String[] files){
        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] arr1 = separate(o1);
                String[] arr2 = separate(o2);

                int headValue = arr1[0].compareTo(arr2[0]);

                if(headValue == 0){
                    int num1 = Integer.parseInt(arr1[1]);
                    int num2 = Integer.parseInt(arr2[1]);

                    return num1 - num2;
                }else{
                    return headValue;
                }
            }
        });

        return files;
    }

    public String[] separate(String str){
        String head = "";
        String number = "";
        String tail = "";
        int point = 0;

        // head 검출
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9') {
                point = i;
                break;
            }
            head += ch;
        }

        // number 검출
        for(int i = point; i < str.length(); i++){
            char ch = str.charAt(i);
            if(!(ch >= '0' && ch <= '9')){
                point = i;
                break;
            }
            number += ch;
        }

        // tail 검출
        tail = str.substring(point, str.length());

        return new String[]{head.toLowerCase(), number, tail};
    }
    public static void main(String[] args){
        String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};

        SortFileName sol = new SortFileName();
        System.out.println(Arrays.toString(sol.sortFileName(files)));
    }
}
