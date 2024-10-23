class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int total = 0;
        int numbersLength = 0;
        
        if(1 <= numbers.length && numbers.length <= 100){
            for(int i = 0; i < numbers.length; i++){ //배열 길이, 값 확인
              total += numbers[i]; // 배열 값 더하기
              numbersLength = i + 1;//인덱스 0번부터 시작하기 때문에 
            }//for
            answer = (double)total / numbersLength;
        }//if
        return answer;
    }//solution
}//end class