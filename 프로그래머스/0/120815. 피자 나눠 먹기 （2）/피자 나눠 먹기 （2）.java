//전체 피자 조각 6배수
//n명이 같은 개수로 먹어야 하니까 n으로 나누어져야 함
//6이랑 n의 최소공배수 구해서 피자 판 수 계산

//풀이법 추가 -> 최대공약수로 최소공배수 구하기
//최소공배수 = (n * 6) / 최대공약수

//최대공약수 - 유클리드 호제법 사용
//(큰 수, 작은 수) -> (작은 수, 큰 수 % 작은수)
// -> 이 과정 반복해도 최대공약수 변하지 x

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int maxNumber = Math.max(n, 6);
        int minNumber = Math.min(n, 6);
        
        while(minNumber != 0){
            int remainder = maxNumber % minNumber;

            maxNumber = minNumber;
            minNumber = remainder;
        }
        
        int gcd = maxNumber;
        int lcm = (n * 6) / gcd;   
        answer = lcm / 6;
        
        return answer;
    }
}