class Solution {
    public long solution(long n) {
        long answer = 0;
     
        double x = Math.sqrt(n);//제곱근
        
        if(n % x == 0){//나머지가 0이라면(= 양의 정수 제곱근이라는 의미) 
            answer = (long)Math.pow(x + 1 , 2);//(x + 1)제곱해서 answer에 넣기
        }else{//나머지가 0이 아니라면
            answer = -1;
        }//if-else
        
        return answer;
    }//solution
}//end class