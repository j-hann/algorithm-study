
class Solution {
    public int[] solution(long n) {
        //long 타입 값을 string 타입으로 변환
        String number = String.valueOf(n);
        //StringBuilder 생성, number 값 넣기
        StringBuilder stringBuilder = new StringBuilder(number);
        stringBuilder.reverse();//역순 메서드 사용
     
        //String 배열 생성, 문자열 분리
        String[] numberString = stringBuilder.toString().split("");
        //numberString 길이만큼 배열 생성
        int[] answer = new int[numberString.length];
        
        //answer 배열에 numberString 배열 넣어주기
        for(int i = 0; i < numberString.length; i++){
            //문자열 int로 형변환 후 answer 배열에 넣기
            answer[i] = Integer.parseInt(numberString[i]);
        }//for

        return answer;
    }//solution
}//end class
