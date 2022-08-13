package Java.Programmers.Lv2;

import java.util.Arrays;

class LifeBoat{
    public int lifeBoat(int[] people, int limit){
        Arrays.sort(people);
        int min = 0, answer = 0;

        for(int max = people.length-1; max>=min; max--){
            if(people[min] + people[max] <= limit) min++;
            answer++;
        }

        return answer;
    }

    public static void main(String[] args){
        int[] people = {70, 50, 80, 50};
        int limit = 100;

        LifeBoat sol = new LifeBoat();
        System.out.println(sol.lifeBoat(people, limit));
    }

}
