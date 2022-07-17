package Java.Programmers.Lv2;

import java.util.LinkedList;
import java.util.Queue;

class CrossingTruck{
    public int crossingTruck(int bridge_length, int weight, int[] truck_weights){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        int time = 0;
        int point = 0;
        int currentWeight = 0;
        int arrivedCount = 0;
        // 7, 4, 5, 6
        while(arrivedCount < truck_weights.length-1){
            if(!queue.isEmpty()) {
                int pollValue = queue.poll();
                if (pollValue != 0) {
                    currentWeight -= pollValue;
                    arrivedCount++;
                }
            }
            if(currentWeight + truck_weights[point] > weight){
                queue.add(0);
            }else{
                queue.add(truck_weights[point]);
                currentWeight += truck_weights[point];

                point++;
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
