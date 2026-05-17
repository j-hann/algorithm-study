//반복문 돌면서 s 문자열 탐색하여 p랑 y 개수 카운트
//p랑 y개수 비교, 같으면 true 다르면 false

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        
        for(int i = 0; i < s.length(); i++){
            
            char temp = s.charAt(i);
            
            if(temp == 'p' || temp == 'P'){
                pCount++;
            } else if(temp == 'y' || temp == 'Y'){
                yCount++;
            }
        }
        
        if(pCount != yCount){
            answer = false;
        }
        
        return answer;
        
    }
}