package Java.Programmers.Lv2;

import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> arrList = new ArrayList<>();
        HashMap<String, Integer> termsHm = new HashMap<>();

        DateForm dToday = new DateForm(today);

        for(String s : terms){
            String[] arr = s.split(" ");
            termsHm.put(arr[0], Integer.parseInt(arr[1]));
        }

        for(int i = 0; i < privacies.length; i++){
            String[] pArr = privacies[i].split(" ");
            DateForm df = new DateForm(pArr[0]);

            df.setM(df.getM() + termsHm.get(pArr[1]));

            if(df.getD() == 1) {
                df.setM(df.getM() - 1);
                df.setD(28);
            }
            if(df.getM() > 12){
                int value = df.getM() / 12;
                df.setM(df.getM() % 12);
                df.setY(df.getY() + value);
            }

            // 날짜 비교
            // Date date1 = new Date(dToday.getY(), dToday.getM(), dToday.getD());
            // Date date2 = new Date(df.getY(), df.getM(), df.getD());

            if(!checkDate(dToday, df)) arrList.add(i+1);
        }

        int[] answer = new int[arrList.size()];
        for(int i = 0; i < arrList.size(); i++){
            answer[i] = arrList.get(i).intValue();
        }
        return answer;
    }

    public boolean checkDate(DateForm date1, DateForm date2){
        // date1(오늘) 보다 date2(비교날짜)가 뒤면 false 반환
        if(date1.getY() <= date2.getY()){
            if(date1.getM() <= date2.getM()){
                if(date1.getD() < date2.getD()) return true;
            }
        }
        return false;
    }
    class DateForm{
        int y, m, d;
        public DateForm(String date){
            String[] dateArr = date.split("\\.");
            y = Integer.parseInt(dateArr[0]);
            m = Integer.parseInt(dateArr[1]);
            d = Integer.parseInt(dateArr[2]);
        }

        public void setY(int y){
            this.y = y;
        }
        public int getY(){
            return y;
        }
        public void setM(int m){
            this.m = m;
        }
        public int getM(){
            return m;
        }
        public void setD(int d){
            this.d = d;
        }
        public int getD(){
            return d;
        }
    }

    public static void main(String[] args){
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(today, terms, privacies)));
    }
}