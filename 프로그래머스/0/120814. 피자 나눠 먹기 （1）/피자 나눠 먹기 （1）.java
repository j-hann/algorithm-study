// n / 7 = 1 -> 소수점 있다면 올림
// 만약 7명 이하일 경우는 무조건 피자 1개

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n <= 7){
            answer = 1;            
        } else {
            double pizzaCount = (double) n / 7;
            answer = (int) Math.ceil(pizzaCount);
        }
        
        return answer;
    }
}