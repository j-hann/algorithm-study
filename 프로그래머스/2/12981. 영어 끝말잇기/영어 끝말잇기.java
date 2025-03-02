import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        //초기값 설정
        int[] answer = new int[]{0, 0};
        HashSet<String> wordRelay = new HashSet<>();
        
        //차례 카운트
        int count = 0;
        //첫번째 단어 저장
        wordRelay.add(words[0]);
        
        //문자열 전체 돌면서 중복되는 단어 있는지 체크
        for(int i = 1; i < words.length; i++){
            //차례 증가
            count++;
            
            //현재 단어
            String currentWord = words[i];
            //이전 단어
            String previousWord = words[i -1 ];
            
            //단어 끝 체크 -> 이전 단어 끝이랑 현재 단어 첫번째가 맞지 않거나, 현재 단어가 wordRelay에 존재하면
            if(previousWord.charAt(previousWord.length() - 1) != currentWord.charAt(0) || wordRelay.contains(currentWord)){ 
                //사람 번호 -> 1번부터
                int person = (count % n) + 1;
                //차례
                int turn = (count / n) + 1;
                
                //값 저장
                answer = new int[]{person, turn};
                return answer;
            }
            
            //단어 추가
            wordRelay.add(currentWord);
        }

        return answer;
    }
}