package Java.Baekjoon.Dfs1;
/**
  오늘도 서준이는 깊이 우선 탐색(DFS)수업 조교를 하고 있다.아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.

  N개의 정점과 M개의 간선으로 구성된 무방향 그래프(undirected graph)가 주어진다.정점 번호는 1번부터 N번이고 모든 간선의 가중치는 1이다.정점 R에서 시작하여 깊이 우선 탐색으로 노드를 방문할 경우 노드의 방문 순서를 출력하자.

  깊이 우선 탐색 의사 코드는 다음과 같다. 인접 정점은 오름차순으로 방문한다.

입력
  첫째 줄에 정점의 수 N (5 ≤ N ≤ 100,000), 간선의 수 M (1 ≤ M ≤ 200,000), 시작 정점 R (1 ≤ R ≤ N)이 주어진다.

  다음 M개 줄에 간선 정보 u v가 주어지며 정점 u와 정점 v의 가중치 1인 양방향 간선을 나타낸다. (1 ≤ u < v ≤ N, u ≠ v) 모든 간선의 (u, v) 쌍의 값은 서로 다르다.

출력
  첫째 줄부터 N개의 줄에 정수를 한 개씩 출력한다. i번째 줄에는 정점 i의 방문 순서를 출력한다. 시작 정점의 방문 순서는 1이다. 시작 정점에서 방문할 수 없는 경우 0을 출력한다.

예제 입력
5 5 1
1 4
1 2
2 3
2 4
3 4

예제 출력
1
2
3
4
0
**/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Main{
    static int count;
    static int[] visited;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        visited = new int[N+1];

        for(int i = 0; i < N+1; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            // 양방향이기 때문에 두 군데 모두 추가
            graph.get(from).add(to);
            graph.get(to).add(from);
        }

        // 오름차순을 위해 정렬
        for(int i = 1; i < graph.size(); i++){
            Collections.sort(graph.get(i));
        }

        // 시작 정점도 순서에 포함
        count = 1;

        // dfs 시작
        dfs(R);

        for(int i = 1; i<visited.length; i++){
            sb.append(visited[i]).append("\n");
        }
        System.out.println(sb);
    }

    public static void dfs(int r){
        visited[r] = count; // 현재 방문한 정점에 순서 저장

        for(int i = 0; i< graph.get(r).size(); i++){
            int idx = graph.get(r).get(i);

            if(visited[idx] == 0){
                count++;
                dfs(idx);
            }
        }

    }

}