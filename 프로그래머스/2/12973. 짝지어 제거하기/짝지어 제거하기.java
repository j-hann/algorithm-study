import java.util.*;

class Solution{
    
    public int solution(String s){
        int answer = -1;
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char currentString = s.charAt(i);
            
            //스택에 값이 있거나 맨 앞 문자가 현재 문자랑 같으면
            if(!stack.isEmpty() && stack.peek() == currentString){
                //스택에서 제거
                stack.pop();
            } else {
                //스택이 비어있거나 같지 않으면 스택에 추가
                stack.push(currentString);
            }
            
            //짝지어 제거하기 성공하면 1 아니며 0 반환
            if(stack.isEmpty()){
                answer = 1;
            } else {
                answer = 0;
            }
        }
        return answer;
    }
}