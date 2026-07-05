//전체 피자 조각 6배수
//n명이 같은 개수로 먹어야 하니까 n으로 나누어져야 함
//6이랑 n의 최소공배수 구해서 피자 판 수 계산

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int maxNumber = Math.max(n, 6);
        int lcm = maxNumber;
        
        while(lcm % 6 != 0 || lcm % n != 0){
            lcm += maxNumber;
        }

        answer = lcm / 6;
        return answer;
    }
}