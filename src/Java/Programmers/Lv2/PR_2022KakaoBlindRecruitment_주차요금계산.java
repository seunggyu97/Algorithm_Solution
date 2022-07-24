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
                String time = hm.get(arr[1]);
                String[] timeOutArr = time.split(":");
                String[] timeInArr = arr[0].split(":");
                int timeIn = Integer.parseInt(timeInArr[0])*60 + Integer.parseInt(timeInArr[1]);
                int timeOut = Integer.parseInt(timeOutArr[0])*60 + Integer.parseInt(timeOutArr[1]);
                accuredTime.put(arr[1], timeOut-timeIn);

                // in - out 처리 완료되면 해시맵에서 삭제
                hm.remove(arr[1]);
            }
        }
        if(!hm.isEmpty()) {
            for (Map.Entry<String, String> entry : hm.entrySet()) {
                String[] time = entry.getValue().split(":");
                int resultTime = (60*23 + 59) - ((Integer.parseInt(time[0])*60)+ Integer.parseInt(time[1]));
                accuredTime.put(entry.getKey(), Integer.parseInt(entry.getValue())+resultTime);
            }
        }
        int[] result = new int[accuredTime.size()];
        int idx = 0;
        for(Map.Entry<String, Integer> entry : accuredTime.entrySet()){
            if(entry.getValue() > ){

            }

            idx++;
        }
    }

    public static void main(String[] args){
        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};

        ParkingFee sol = new ParkingFee();
        System.out.println(Arrays.toString(sol.parkingFee(fees, records)));
    }
}