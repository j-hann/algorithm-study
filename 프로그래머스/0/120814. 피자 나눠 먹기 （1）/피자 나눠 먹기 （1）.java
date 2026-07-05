class Solution {
    public int solution(int n) {
        int answer = 0;

        double pizzaCount = (double) n / 7;
        answer = (int) Math.ceil(pizzaCount);
        
        return answer;
    }
}