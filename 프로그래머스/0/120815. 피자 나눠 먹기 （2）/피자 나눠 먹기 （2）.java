//전체 피자 조각 6배수
//n명이 같은 개수로 먹어야 하니까 n으로 나누어져야 함
//6이랑 n의 최소공배수 구해서 피자 판 수 계산

//풀이법 추가 -> 최대공약수로 최소공배수 구하기
//최소공배수 = (n * 6) / 최대공약수

//최대공약수 - 유클리드 호제법 사용
//(큰 수, 작은 수) -> (작은 수, 큰 수 % 작은수)
// -> 이 과정 반복해도 최대공약수 변하지 x

//최소공배수 공식 정리
//((n * 6) / gcd(n, 6)) / 6 -> n / gcd(n, 6)

class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = n / gcd(n, 6);
        
        return answer;
    }
    
    private int gcd(int num1, int num2){
        
        while(num2 != 0){
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        
        return num1;
    }
}