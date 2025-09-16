//[접근방법]
//문자열 인덱스 탐색하기, 기준 인덱스에서 왼쪽으로 이동하면서 같은 문자열 있는지 체크
//count 해주면서 비교 인덱스와 기준 인덱스 문자열이 일치하면 배열에 숫자 값 넣기
//일치하지 않을 경우 -1

// - 시간이 오래 걸릴 경우  -> 이전 인덱스를 기억해두고 현재 인덱스랑 거리 계산해서 넣기
// HashMap 사용하여 인덱스랑 문자열 기억

import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> saveIndex = new HashMap<Character, Integer>();

        for(int i = 0; i < s.length(); i++){
            char character = s.charAt(i);
            
            Integer previousIndex = saveIndex.get(character);
            
            if(previousIndex == null){
                answer[i] = -1;    
            } else {
                answer[i] = i - previousIndex;
            }
            
            saveIndex.put(character, i);
        }
        
        return answer;
    }
}