import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        
        //입력받은 값이 0보다 클때까지만 while 반복 -> 각 자릿수 다 구하면 0
        while(n > 0){
            //자릿값 하나씩 구해서 더해주기
            sum += n % 10;
            //일의 자리값 없애기
            n = n / 10;
        }//while
        
        answer = sum;

        return answer;
    }//solution
}//end class