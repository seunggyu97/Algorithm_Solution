package Java.Programmers.Lv2;

class VisitedLength{
    boolean[][] dp;
    public int visitedLength(String dirs){
        dp = new boolean[11][11];
        int count = 0;
        int[] pos = {5, 5};

        dp[5][5] = true;

        for(int i = 0; i<dirs.length(); i++){
            char ch = dirs.charAt(i);
            boolean isPossible = true;
            switch (ch){
                case 'U':
                    if(pos[1] == 0){
                        isPossible = false;
                        break;
                    }
                    if(!dp[pos[0]][pos[1]-1]){
                        dp[pos[0]][pos[1]-1] = true;
                    }
                    pos[1]--;
                    break;
                case 'D':
                    if(pos[1] == 10){
                        isPossible = false;
                        break;
                    }
                    if(!dp[pos[0]][pos[1]+1]){
                        dp[pos[0]][pos[1]+1] = true;
                    }
                    pos[1]++;
                    break;
                case 'L':
                    if(pos[0] == 0){
                        isPossible = false;
                        break;
                    }
                    if(!dp[pos[0]-1][pos[1]]){
                        dp[pos[0]-1][pos[1]] = true;
                    }
                    pos[0]--;
                    break;
                case 'R':
                    if(pos[0] == 10){
                        isPossible = false;
                        break;
                    }
                    if(!dp[pos[0]+1][pos[1]]){
                        dp[pos[0]+1][pos[1]] = true;
                    }
                    pos[0]++;
                    break;
            }
            if(!isPossible) continue;
            count++;
        }

        return count;
    }

    public static void main(String[] args){
        String dirs = "LULLLLLLU";
        VisitedLength sol = new VisitedLength();

        System.out.println(sol.visitedLength(dirs));
    }
}