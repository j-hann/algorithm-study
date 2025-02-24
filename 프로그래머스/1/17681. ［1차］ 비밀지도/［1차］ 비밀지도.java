import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        //n개 크기만큼 배열 생성
        String[] firstMap = new String[n];
        String[] secondMap = new String[n];
        
        //첫번째 지도 - 인덱스에 해당하는 정수를 이진 문자열로 변환
        for(int i = 0; i < n; i++){
            String firstBinaryString = Integer.toBinaryString(arr1[i]);
            
            //문자열 길이가 n보다 작을 경우 -> 공백을 0으로 변환
            while(firstBinaryString.length() < n){
                firstBinaryString = "0" + firstBinaryString;
            }   
            
            //변환된 이진 문자열을 0이면 공백, 1이면 #으로 치환 후 저장
            firstMap[i] = firstBinaryString
                .replace('0', ' ')
                .replace('1', '#');
        }
        
        //두번째 지도 - 인덱스에 해당하는 정수를 이진 문자열로 변환
        for(int i = 0; i < n; i++){
            String secondBinaryString = Integer.toBinaryString(arr2[i]);
            
            //문자열 길이가 n보다 작을 경우 -> 공백을 0으로 변환
            while(secondBinaryString.length() < n){
                secondBinaryString = "0" + secondBinaryString;
            }   
            
            //변환된 이진 문자열을 0이면 공백, 1이면 #으로 치환 후 저장
            secondMap[i] = secondBinaryString
                .replace('0', ' ')
                .replace('1', '#');
        }
        
        //최종 지도 만들기
        for(int i = 0; i < n; i++){
            StringBuilder stringBuilder = new StringBuilder();
            
            //두 배열 중 인덱스에 #이 있으면 # 넣고, 아니면 공백 넣기
            for(int j = 0; j < n; j++){
                if(firstMap[i].charAt(j) == '#' || secondMap[i].charAt(j) == '#'){
                    stringBuilder.append('#');
                } else {
                    //공백 넣기
                    stringBuilder.append(' ');
                }
            }
            
            
            answer[i] = stringBuilder.toString();
        }
        
        return answer;
    }
}