//정수 나눗셈 올림 공식으로 피자 판 수 계산

class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        answer = (n + slice - 1) / slice;
        
        return answer;
    }
}