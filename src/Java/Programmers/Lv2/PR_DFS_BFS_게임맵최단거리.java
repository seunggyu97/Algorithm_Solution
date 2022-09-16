package Java.Programmers.Lv2;

import java.util.LinkedList;
import java.util.Queue;

class ShortestDistance {
    public int shortestDistance(int[][] maps){
        int answer = 0;
        int count[][] = new int[maps.length][maps[0].length];
        int[][] move = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

        count[0][0] = 1;
        Queue<Position> q = new LinkedList<>();
        q.add(new Position(0, 0));

        while(!q.isEmpty()){
            Position cur = q.poll();
            int curCount = count[cur.y][cur.x];

            for(int i = 0; i < move.length; i++){
                Position p = new Position(cur.x + move[i][0] , cur.y + move[i][1]);

                // 맵 밖으로 나갈 경우
                if(p.x < 0 || p.y < 0 || p.x==maps[0].length || p.y == maps.length){
                    continue;
                }

                // 벽에 부딪힐 경우
                if(maps[p.y][p.x] == 0) continue;

                count[p.y][p.x] = curCount + 1;
                maps[p.y][p.x] = 0;
                q.add(p);
            }
        }
        answer = count[maps.length-1][maps[0].length-1];
        if(answer == 0) answer = -1;
        return answer;
    }

    public static void main(String[] args){
        int[][] maps = {
                {1,0,1,1,1},
                {1,0,1,0,1},
                {1,0,1,1,1},
                {1,1,1,0,1},
                {0,0,0,0,1}};
        ShortestDistance sol = new ShortestDistance();
        System.out.println(sol.shortestDistance(maps));
    }
}

class Position{
    int x, y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }
}
