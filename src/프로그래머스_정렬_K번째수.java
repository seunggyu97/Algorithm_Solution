//import java.util.Arrays;
//
//class Sort {
//    public int[] sort(int[] array, int[][] commands){
//        int[] answer = new int[commands.length];
//        // 정렬 문제
//        // 1. commands[]의 길이만큼 반복
//        for(int i = 0; i<commands.length; i++){
//            int[] sortedArray = new int[commands[i][1]-commands[i][0] + 1];
//            int a = 0;
//            for(int j = commands[i][0]-1; j<commands[i][1]; j++){
//                sortedArray[a] = array[j];
//                a++;
//            }
//            Arrays.sort(sortedArray);
//            answer[i] = sortedArray[commands[i][2] - 1];
//        }
//        return answer;
//    }
//
//    public static void main(String[] args){
//        int[] array = { 1, 5, 2, 6, 3, 7, 4};
//        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//        Sort s = new Sort();
//
//        System.out.println(Arrays.toString(s.sort(array, commands)));
//    }
//}
