class Solution {
    public int solution(int n) {
        //상수 값 초기화
        final int DIVISOR = 1234567;
        
        //피보나치 수열 첫번째, 두번째 값 처리
        if(n <= 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        
        //이전 피보나치 수
        int previous = 0;
        //현재 피보나치 수
        int current = 1;
        //n번째 피보나치 수
        int answer = 1;
        
        //n번째 피보나치 수 계산
        for(int i = 2; i <= n; i++){
            answer = (previous + current) % DIVISOR;
            previous = current;
            current = answer;
        }
        
        return answer;
    }
}