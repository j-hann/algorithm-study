//[접근방법]
//문자열 인덱스 탐색하기, 기준 인덱스에서 왼쪽으로 이동하면서 같은 문자열 있는지 체크
//count 해주면서 비교 인덱스와 기준 인덱스 문자열이 일치하면 배열에 숫자 값 넣기
//일치하지 않을 경우 -1

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            char character = s.charAt(i);
            count = 0;
            answer[i] = -1;
            
            for(int j = i-1; j >= 0; j--){
                char compareIndex = s.charAt(j);
                count++;
                
                if(character == compareIndex){
                    answer[i] = count;
                    break;
                }
            }
        }
        
        return answer;
    }
}