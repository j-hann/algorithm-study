class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        //이진 변환 횟수
        int conversionCount = 0;
        //제거된 0의 개수
        int removedZeroCount = 0;
        
        //이진 변환이 1이 될 때까지 반복
        while(!s.equals("1")){
            int originalLength = s.length();
            
            //문자열에서 0 제거
            s = s.replace("0", "");
            
            //전체 문자 길이에서 0을 제거한 길이 빼기 -> 제거된 0의 개수 누적
            removedZeroCount = removedZeroCount + (originalLength - s.length());
            //문자열 길이 십진수 -> 이진수로 변환
            s = Integer.toBinaryString(s.length());
            
            conversionCount++;
        }
        
        answer[0] = conversionCount;
        answer[1] = removedZeroCount;
        
        return answer;
    }
}