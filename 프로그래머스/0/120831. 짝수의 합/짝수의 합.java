class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        
        if(0 < n && n <= 1000){// n 범위
            //짝수 찾기
            //정수 n 이하 숫자까지 반복문 돌리기
           for(int num = 1; num <= n; num++){
               if(num % 2 == 0){// num/2의 나머지가 0일 경우(짝수)
                   sum = sum + num; //sum 변수에 짝수만 넣어서 더해주기
               }//if-inner
           }//for
            answer = sum;
        }//if-outer
        
        return answer;
    }//solution
}//end class