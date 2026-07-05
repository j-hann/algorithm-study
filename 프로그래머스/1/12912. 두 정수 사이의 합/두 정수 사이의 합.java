class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long sum = 0;
        
        int minNumber = Math.min(a, b);
        int maxNumber = Math.max(a, b);
        
        for(int i = minNumber; i <= maxNumber; i++){
            sum += i;
        }
        
        answer = sum;
        return answer;
    }
}