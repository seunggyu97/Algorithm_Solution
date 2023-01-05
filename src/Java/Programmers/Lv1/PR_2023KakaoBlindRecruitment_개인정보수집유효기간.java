package Java.Programmers.Lv1.Privacy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answerList = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap<>();

        DateClass Today = new DateClass(today);

        for(String s : terms) {
            String[] str = s.split(" ");
            hm.put(str[0], Integer.parseInt(str[1]));
        }

        for(int i = 0; i<privacies.length; i++) {
            String[] tmp = privacies[i].split(" ");
            DateClass PriDate = new DateClass(tmp[0]);

            PriDate.month += hm.get(tmp[1]);
            PriDate.day--;

            if(PriDate.day == 0) {
                PriDate.day = 28;
                PriDate.month--;
                if(PriDate.month == 0) {
                    PriDate.month = 12;
                    PriDate.year--;
                }
            }
            if(PriDate.month > 12) {
                int plus = PriDate.month / 12;
                PriDate.month %= 12;
                PriDate.year += plus;
            }

            if(Today.year >= PriDate.year) {
                if(Today.year == PriDate.year) {
                    if(Today.month >= PriDate.month) {
                        if(Today.month == PriDate.month) {
                            if(Today.day > PriDate.day) {
                                answerList.add(i+1);
                            }
                            continue;
                        }
                        answerList.add(i+1);
                    }
                    continue;
                }
                answerList.add(i+1);
            }
        }

        int[] answer = new int[answerList.size()];
        for(int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }

    class DateClass {
        int year, month, day;
        DateClass(String date) {
            String[] arr = date.split("\\.");
            this.year = Integer.parseInt(arr[0]);
            this.month = Integer.parseInt(arr[1]);
            this.day = Integer.parseInt(arr[2]);
        }
    }
    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(today, terms, privacies)));
    }
}