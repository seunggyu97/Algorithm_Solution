package Java.Programmers.Lv2;

import java.util.*;

class ParkingFee{
    public int[] parkingFee(int[] fees, String[] records){
        Map<String, String> hm = new HashMap<>();
        Map<String, Integer> accuredTime = new HashMap<>();
        for(int i = 0; i<records.length; i++){
            String[] arr = records[i].split(" ");

            if(arr[2].equals("IN")){
                hm.put(arr[1], arr[0]);
            }
            else{
                String[] timeInArr = hm.get(arr[1]).split(":");
                String[] timeOutArr = arr[0].split(":");
                int timeIn = Integer.parseInt(timeInArr[0])*60 + Integer.parseInt(timeInArr[1]);
                int timeOut = Integer.parseInt(timeOutArr[0])*60 + Integer.parseInt(timeOutArr[1]);
                accuredTime.put(arr[1], accuredTime.getOrDefault(arr[1],0)+timeOut-timeIn);
                // in - out 처리 완료되면 해시맵에서 삭제
                hm.remove(arr[1]);
            }
        }

        // 출차 하지 않은 차량 요금계산
        if(!hm.isEmpty()) {
            for (Map.Entry<String, String> entry : hm.entrySet()) {
                String[] time = entry.getValue().split(":");
                int resultTime = (60*23 + 59) - ((Integer.parseInt(time[0])*60)+ Integer.parseInt(time[1]));
                accuredTime.put(entry.getKey(), accuredTime.getOrDefault(entry.getKey(),0)+resultTime);
            }
        }
        int[] result = new int[accuredTime.size()];
        List<Map.Entry<String, Integer>> list = new ArrayList(accuredTime.entrySet());
        list.sort((o1, o2) -> {
            return Integer.compare(Integer.parseInt(o1.getKey()), Integer.parseInt(o2.getKey()));
        });
        for(int i = 0; i<list.size(); i++){
            if(list.get(i).getValue() <= fees[0]){
                result[i] = fees[1];
            }else{
                result[i] = fees[1] + (int)Math.ceil((double)(list.get(i).getValue() - fees[0])/fees[2])*fees[3];
            }
        }

        return result;
    }

    public static void main(String[] args){
        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:34 5961 OUT", "07:34 5961 IN", "08:34 5961 OUT", "09:34 5961 IN", "10:34 5961 OUT", "11:34 5961 IN", "12:34 5961 OUT"};

        ParkingFee sol = new ParkingFee();
        System.out.println(Arrays.toString(sol.parkingFee(fees, records)));
    }
}