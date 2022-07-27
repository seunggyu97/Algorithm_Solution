package Java.Programmers.Lv2;

class VisitedLength{
    boolean[][] widthV;
    boolean[][] heightV;
    public int visitedLength(String dirs){
        widthV = new boolean[10][11];
        heightV = new boolean[11][10];
        int count = 0;
        int[] pos = {5, 5};

        for(int i = 0; i<dirs.length(); i++){
            char ch = dirs.charAt(i);
            // ULURRDLLU
            switch (ch){
                case 'U':
                    if(pos[1] == 0){
                        break;
                    }
                    if(!heightV[pos[0]][pos[1]-1]){
                        heightV[pos[0]][pos[1]-1] = true;
                        count++;
                    }
                    pos[1]--;
                    break;
                case 'D':
                    if(pos[1] == 10){
                        break;
                    }
                    if(!heightV[pos[0]][pos[1]]){
                        heightV[pos[0]][pos[1]] = true;
                        count++;
                    }
                    pos[1]++;
                    break;
                case 'L':
                    if(pos[0] == 0){
                        break;
                    }
                    if(!widthV[pos[0]-1][pos[1]]){
                        widthV[pos[0]-1][pos[1]] = true;
                        count++;
                    }
                    pos[0]--;
                    break;
                case 'R':
                    if(pos[0] == 10){
                        break;
                    }
                    if(!widthV[pos[0]][pos[1]]){
                        widthV[pos[0]][pos[1]] = true;
                        count++;
                    }
                    pos[0]++;
                    break;
            }
        }

        return count;
    }

    public static void main(String[] args){
        String dirs = "ULURRDLLU";
        VisitedLength sol = new VisitedLength();

        System.out.println(sol.visitedLength(dirs));
    }
}