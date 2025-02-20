class Solution {
    public int solution(int n) {
        int answer = 0;
        
        //n -> 2진수 문자열로 변환
        String firstBinary = Integer.toBinaryString(n);
        //1 개수 카운트
        int numberCount = 0;
        
        for(int i = 0; i < firstBinary.length(); i++){
            //2진수 문자열로 변환된 n의 1의 개수를 카운트
            if(firstBinary.charAt(i) == '1'){
                numberCount++;
            }
        }
        
        //1의 개수가 같은 숫자 찾기
        for(int i = n+1; ; i++){
            String secondBinary = Integer.toBinaryString(i);
            int secondNumberCount = 0;
            
            //2진수 문자열로 변환된 i의 1의 개수를 카운트
            for(int j = 0; j < secondBinary.length(); j++){
                if(secondBinary.charAt(j) == '1'){
                    secondNumberCount++;
                }
            }
            
            //i랑 n의 1의 개수가 같으면 종료
            if(numberCount == secondNumberCount){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}