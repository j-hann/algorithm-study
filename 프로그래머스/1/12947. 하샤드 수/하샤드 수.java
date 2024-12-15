import  java.util.ArrayList;
    
class Solution {
    public boolean solution(int x) {
        
        int originalX  = x;
        
        boolean answer = true;
        
        ArrayList<Integer> remainder = new ArrayList<>();
        
        //자릿수 값 구하기
        while(x > 0){
            //나머지 remainder list 변수에 저장
            remainder.add(Integer.valueOf(x % 10)); 
            //몫 저장
            x = x / 10; 
        }
        
        //자릿수 합 구하기
        int sum = 0;
        for(int number : remainder){
            sum += number;
        }
        
        //하샤드 수 판별
        if(originalX % sum == 0){
            answer = true;
        } else {
            answer = false;
        }
        
        return answer;
    }
}