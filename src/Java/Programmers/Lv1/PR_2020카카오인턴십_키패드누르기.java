//class Solution{
//    StringBuilder sb = new StringBuilder();
//    Locate LHand, RHand, numPos;
//    public String solution(int[] numbers, String hand){
//        LHand = new Locate(3,0);
//        RHand = new Locate(3,2);
//
//        for(int n : numbers){
//            numPos = new Locate((n-1)/3,(n-1)%3);
//            if(n==0) numPos = new Locate(3,1);
//            String finger = numPos.getFinger(hand);
//
//            sb.append(finger);
//            if(finger.equals("L")) LHand = numPos;
//            else RHand = numPos;
//        }
//        return sb.toString();
//    }
//    class Locate{
//        int row, col;
//        Locate(int row, int col){
//            this.row = row;
//            this.col = col;
//        }
//        public String getFinger(String hand){
//            String finger = hand.equals("right")?"R":"L";
//            if(this.col == 0) finger = "L";
//            else if(this.col == 2) finger = "R";
//            else{
//                int leftDist = LHand.getDistance(this);
//                int rightDist = RHand.getDistance(this);
//
//                if(leftDist < rightDist) finger = "L";
//                else if(leftDist > rightDist) finger = "R";
//            }
//
//            return finger;
//        }
//
//        public int getDistance(Locate l){
//            return Math.abs(this.row - l.row) + Math.abs(this.col - l.col);
//        }
//    }
//
//    public static void main(String[] args){
//        int[] numbers = {1,3,4,5,8,2,1,4,5,9,5};
//        String hand = "right";
//        Solution sol = new Solution();
//
//        System.out.println(sol.solution(numbers, hand));
//    }
//}