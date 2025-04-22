import java.util.*;

class Solution {
    public int solution(int N, int[][] road, int K) {
        // 그래프 구성하기 -> 인접 리스트 형태
        List<List<int[]>> graph = new ArrayList<>();
        
        //각 마을 번호에 해당하는 연결 리스트 초기화 -> 도로 정보 저장
         for(int i = 0; i <= N; i++){
             graph.add(new ArrayList<>());
             
         }
        
        for(int[] r : road){
            int from = r[0]; //시작마을
            int to = r[1]; //도착마을
            int cost = r[2]; //거리
            
            //from -> to랑 & to -> from 다 저장 : 양방향 도로
            //각 항목은 연결된 마을 번호와 거리 정보
            graph.get(from).add(new int[]{to, cost});
            graph.get(to).add(new int[]{from, cost});
        }
        
                        
        int[] dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        //시작 노드는 거리 0
        dist[1] = 0;
        
         //우선순위 큐 생성 -> 거리가 가장 짧은 노드를 우선으로 처리
        //각 요소 {노드 번호, 현재까지 누적 거리}
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        //시작 지점 추가
        pq.offer(new int[]{1, 0});
        
         //다익스트라 알고리즘 적용
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            
            //현재 노드
            int now = current[0];
            //현재까지 누적 거리
            int cost = current[1];

            //이미 더 짧은 거리로 방문한 적이 있다면 스킵
            if (dist[now] < cost) {
                continue;
            }
            
            //인접 노드들 순회
            for (int[] next : graph.get(now)) {
                int nextNode = next[0];
                
                //현재 거리 + 다음 거리
                int nextCost = cost + next[1];

                //더 짧은 경로가 발견되면 갱신
                if (nextCost < dist[nextNode]) {
                    dist[nextNode] = nextCost;
                    pq.offer(new int[]{nextNode, nextCost});
                }
            }
        }

        int answer = 0;
        
        //최종 거리 배열에서 K 이하인 노드 개수 세기
        for (int i = 1; i <= N; i++) {
            if (dist[i] <= K) {
                answer++;
            }
        }

        return answer;
        
    }
}