//연속된 정수 합 -> 등차수열 합 공식 사용
//항 개수 * (첫 항 + 마지막 항) / 2

class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        int minNumber = Math.min(a, b);
        int maxNumber = Math.max(a, b);
        
        int count = maxNumber - minNumber + 1;
        answer = (long) count * (minNumber + maxNumber) / 2;

        return answer;
    }
}