import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> hamburgerStack = new Stack<>();
        //제거 횟수 카운트
        int count = 0;
        
        for(int i = 0; i < ingredient.length; i++){
            int currentIngredient = ingredient[i];
            //현재 재료 하나씩 스택에 넣기
            hamburgerStack.push(currentIngredient);
            
            //스택 사이즈가 4 이상이고, 최근 들어간 4개 값 1,2,3,1이면 제거
            if(hamburgerStack.size() >= 4){
                if(hamburgerStack.get(hamburgerStack.size() - 4) == 1 &&
                   hamburgerStack.get(hamburgerStack.size() - 3) == 2 &&
                   hamburgerStack.get(hamburgerStack.size() - 2) == 3 &&
                   hamburgerStack.get(hamburgerStack.size() - 1) == 1){
                    
                    //4개 값 제거해주기
                    for(int j = 0; j < 4; j++){
                        hamburgerStack.pop();
                    }
                    
                    //제거 횟수 저장
                    count++;
                }
                
            }
            
        }
        
        answer = count;
        return answer;
    }
}