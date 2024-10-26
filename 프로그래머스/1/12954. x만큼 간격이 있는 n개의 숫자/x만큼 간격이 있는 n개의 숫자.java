
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        if(-10_000_000 <= x 
           && x <= 10_000_000 
           && n < 1000){ 
            
            for(int i = 0; i < answer.length; i++){
               answer[i] = (long)x * (i + 1);
            }//for
        }//if
        return answer;
    }//main
}//end class