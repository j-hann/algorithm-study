import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        HashSet hashSet = new HashSet();
        
        //배열 2배 확장 -> 원형 수열
        int[] cyclicSequence = new int[elements.length *2];
        
        for(int i = 0; i < elements.length * 2; i++){
            cyclicSequence[i] = elements[i % elements.length];
        }
        
        //길이 1부터 elements 길이만큼 늘려가면서
        for(int length = 1; length <= elements.length; length++){
            int sum = 0;
            
            //길이만큼 더하기
            for(int i = 0; i < length; i++){
                sum = sum + cyclicSequence[i];
            }
            //더한 값 hashSet에 추가
            hashSet.add(sum);
            
            //슬라이딩 윈도우 방식
            //중복되는 값 제외하고 앞의 값 뺴고, 새로운 값 더하는 방식
            for(int startElement = 1; startElement < elements.length; startElement++){
                //맨 앞의 값 뺴고, 새로운 값 더하기
                sum = sum - cyclicSequence[startElement - 1] + cyclicSequence[startElement + length - 1];
                
                hashSet.add(sum);
            }
        }
        
        //더한 값 개수 answer 저장
        answer = hashSet.size();
        return answer;
    }
}