class Solution {
    public String solution(String s) {
        
        StringBuilder answer = new StringBuilder();
        
        //소문자로 변환 후 문자 배열로 변환
        char[] chars = s.toLowerCase().toCharArray();
        
        for(int i = 0; i < chars.length; i++){;
                                              
            //첫번째 문자이거나, 이전 문자가 공백일 경우 대문자로 변환
            if(i == 0 || chars[i - 1] == ' '){
              chars[i] = Character.toUpperCase(chars[i]);
            }
            answer.append(chars[i]);
        }
      
        return answer.toString();
    }
}