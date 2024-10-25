import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> numberList = new ArrayList<Integer>();
            
        //자연수니까 0 포함 x
        for(int x = 1; x <= n; x++){
            if(n % x == 1){//나머지가 1일 경우
                numberList.add(x);
            }//if
        }//for
        
       Collections.sort(numberList);//오름차순 정렬 
       answer =  numberList.get(0);//가장 낮은 숫자
        return answer;
    }//solution
}//end class