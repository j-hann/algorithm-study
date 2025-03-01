
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        //배열 첫번째 숫자 최소공배수 초기값 설정
        int leastCommonMultiple = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            int firstNumber = leastCommonMultiple;
            int secondNumber = arr[i];
            
            //최대공약수 구하기
            while(secondNumber != 0){
                int remainder = firstNumber % secondNumber;
                //다음 숫자
                firstNumber = secondNumber;
                //나머지 값
                secondNumber = remainder;
            }
            
            //최소공배수 구하기 -> 두 숫자 곱하기 / 최대공약수
            leastCommonMultiple = (leastCommonMultiple *  arr[i]) / firstNumber;
        }
        
        answer = leastCommonMultiple;
        
        return answer;
    }
}