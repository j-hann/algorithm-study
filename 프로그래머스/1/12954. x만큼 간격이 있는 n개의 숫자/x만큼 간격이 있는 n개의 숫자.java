
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long number = x;
        
        if(-10_000_000 <= x 
           && x <= 10_000_000 
           && n < 1000){ 
            
            for(int i = 0; i < n; i++){
               answer[i] = number;
                 number = number + x;
            }//for
        }//if
        return answer;
    }//main
}//end class