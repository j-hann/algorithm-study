import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        //long 타입 값 -> String 타입으로 변환
        String number = String.valueOf(n);
        //문자열 하나씩 쪼개기
        String[] numberSplit = number.split("");

        long answer = 0;
        
        //String 배열 내림차순 정렬
       Arrays.sort(numberSplit, Collections.reverseOrder());
        //numberSplit 배열 -> String 타입으로 변환 후 합치기
        StringBuilder stringbuilder = new StringBuilder();
       	for(String string : numberSplit){
       		stringbuilder.append(string);
       	}//for
        
        //answer 배열에 Long 타입으로 변환해서 넣기
        answer = Long.parseLong(stringbuilder.toString());
        
        return answer;
    }//solution
}//end class