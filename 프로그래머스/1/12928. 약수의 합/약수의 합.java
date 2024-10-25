class Solution {
    public int solution(int n) {
        int answer = 0;
        int divisor = 0;
        
        if(0 <= n && n <= 3000){
            for(int i = 1; i <= n; i++){//1부터 시작, 정수를 0으로 나누면 오류남
    //n / i 가 실수가 아닐 경우에만 divisor 변수에 넣어서 더해라
    //=>  나머지가 0일때만 넣기
              if(n % i == 0){
                  divisor += i;
              }//if-inner
            }//for
            
            answer = divisor;
            
        }//if
        return answer;
    }//solution
}//end class