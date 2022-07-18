package Java.Programmers.Lv2;

import java.util.LinkedList;
import java.util.Queue;

class CrossingTruck{
    public int crossingTruck(int bridge_length, int weight, int[] truck_weights){
        Queue<Integer> queue = new LinkedList<>();

        // 처음 트럭이 다리위로 올라갈 때 맨 끝에 서있어야 하기 때문에 큐의 나머지 공간에 0을 집어 넣음
        for(int i = 0; i < bridge_length; i++){
            queue.offer(0);
        }
        int time = 0;
        int currentWeight = 0;
        int point = 0;
        // 7, 4, 5, 6
        while(!queue.isEmpty()){
            currentWeight -= queue.poll();

            if(point < truck_weights.length){
                if(truck_weights[point] + currentWeight <= weight){
                    queue.offer(truck_weights[point]);
                    currentWeight += truck_weights[point];
                    point++;
                }
                else{
                    queue.offer(0);
                }
            }

            time++;
        }
        return time;
    }

    public static void main(String[] args){
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};

        CrossingTruck sol = new CrossingTruck();
        System.out.println(sol.crossingTruck(bridge_length, weight, truck_weights));
    }
}
