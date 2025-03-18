import java.util.*;

class Solution {
    
    //던전 방문 여부 저장
    private static boolean[] isDungeonVisited;
    //탐험할 수 있는 던전 목록 저장
    private static int[][] dungeonList;
    
    private static int exploreDungeons(int currentFatigue, int exploredCount) {
        
        //현재 탐험한 던전 수
        int maxExploredCount = exploredCount;

        //모든 던전에 대해 탐험이 가능한지 확인하기 위해 반복문
        for (int i = 0; i < dungeonList.length; i++) {
            
            //아직 방문하지 않았고, 최소 피로도 충족 시 탐험 가
            if (!isDungeonVisited[i] && currentFatigue >= dungeonList[i][0]) {
                //방문 처리
                isDungeonVisited[i] = true;
                
                //최대 탐험 수 갱신
                maxExploredCount = Math.max(
                    maxExploredCount, 
                    exploreDungeons(currentFatigue - dungeonList[i][1], exploredCount + 1)
                ); 
                
                 //백트래킹 -> 원래 상태로 복구
                isDungeonVisited[i] = false;
            }
        }
        
        //최대 탐험한 던전 개수 반환
        return maxExploredCount; 
    }
    
    
    public int solution(int initialFatigue, int[][] dungeons) {
        
        int answer = -1;
        
        //던전 개수만큼 배열을 생성하여 방문 여부 체크
        isDungeonVisited = new boolean[dungeons.length];
        //던전 리스트 저장
        dungeonList = dungeons;
        
        //탐색 결과 갱신
        answer = Math.max(answer, exploreDungeons(initialFatigue, 0)); 
        
        return answer;
    }
}

