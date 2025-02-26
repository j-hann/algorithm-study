import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        //필요한 구명보트 개수
        int answer = 0;
        
        //몸무게 정렬
        Arrays.sort(people);
        //가장 가벼운 사람 -> 인덱스 왼쪽부터
        int light = 0;
        //가장 무거운 사람 -> 인덱스 오른쪽부터
        int heavy = people.length - 1;
        
        while(light <= heavy){
            //두명 다 태울 수 있으면
            if(people[light] + people[heavy] <= limit){
                //가벼운 사람 탑승 -> 인덱스 오른쪽으로 이동
                light++;
            }
            
            //두명 몸무게 합이 limit보다 크면 무거운 사람 탑승 -> 인덱스 왼쪽으로 이동
            heavy--;
            //사용된 구명 보트 카운트
            answer++;
        }
            
        return answer;
        
    }
}