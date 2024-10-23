class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int total = 0;
        
        if(1 <= numbers.length && numbers.length <= 100){//제한사항
            for(int i = 0; i < numbers.length; i++){ //배열 길이, 값 확인
              total += numbers[i]; // 배열 값 더하기
            }//for
            answer = (double)total / numbers.length ; //길이로 나눠주고 double 형변환
        }//if
        return answer;
    }//solution
}//end class