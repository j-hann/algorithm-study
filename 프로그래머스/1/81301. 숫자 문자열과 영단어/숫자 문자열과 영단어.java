class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] englishWord = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        //해당하는 문자 찾아서 숫자로 치환
        for(int i = 0; i < englishWord.length; i++){
            s = s.replace(englishWord[i], String.valueOf(i));
        }
        
        //문자열 int로 변환
        answer = Integer.parseInt(s);
        
        return answer;
    }
}