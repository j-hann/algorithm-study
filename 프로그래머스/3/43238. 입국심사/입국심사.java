import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        //정렬
        Arrays.sort(times);
        
        long answer = 0;    
        long start = 1;
        long end = (long)n * times[times.length - 1];
        
        while(start <= end){
            //심사 가능한 사람의 수
            long count = 0;
            long mid = (start + end) / 2;

            for(int i = 0; i < times.length; i++){
                count = count + (mid / times[i]);
            }
            
            if(count >= n){
                end = mid - 1;
                answer = mid;
            } else{
                start = mid + 1;
            }
        }
        
        return answer;
    }
}