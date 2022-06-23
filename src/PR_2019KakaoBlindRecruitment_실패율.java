//import java.util.*;
//
//class Solution{
//    class Fail{
//        int stage;
//        double rate;
//        Fail(int stage, double rate){
//            this.stage = stage;
//            this.rate = rate;
//        }
//    }
//
//    Comparator<Fail> comp = new Comparator<Fail>() {
//        @Override
//        public int compare(Fail o1, Fail o2) {
//            if(o1.rate < o2.rate){
//                return 1;
//            }else if(o1.rate>o2.rate){
//                return -1;
//            }else{
//                if(o1.stage > o2.stage){
//                    return 1;
//                }else if(o1.stage < o2.stage){
//                    return -1;
//                }else{
//                    return 0;
//                }
//            }
//        }
//    };
//
//    public int[] solution(int N, int[] stages){
//        // N : 스테이지 수
//        // stages : 현재 머물러있는 스테이지 배열
//        // (N+1은 마지막 스테이지를 클리어 한 사용자)
//        // 실패율 : 스테이지에 도달했지만 아직 클리어하지 못한 플레이어 수 / 스테이지에 도달한 플레이어 수
//        // 실패율이 같다면 작은 번호의 스테이지가 먼저 옴
//        // 스테이지에 도달한 플레이어가 없는 경우 해당 스테이지의 실패율은 0
//        // 반환 : 실패율이 높은 순서부터 내림차순으로 담은 배열
//        int[] answer = new int[N];
//        List<Fail> fails = new ArrayList<Fail>();
//        int total = stages.length;
//
//        int[] users = new int[N+1];
//        for(int i : stages) users[i-1]++;
//        for(int i = 0; i<N; i++){
//            if(users[i]==0){
//                fails.add(new Fail(i+1,0));
//            }
//            else{
//                fails.add(new Fail(i+1, (double)users[i]/total));
//                total -= users[i];
//            }
//        }
//
//        Collections.sort(fails,comp);
//        for(int i = 0; i<N; ++i){
//            answer[i] = fails.get(i).stage;
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args){
//        int N = 5;
//        int[] stages = {2,1,2,6,2,4,3,3};
//        Solution sol = new Solution();
//
//        System.out.println(Arrays.toString(sol.solution(N, stages)));
//    }
//}