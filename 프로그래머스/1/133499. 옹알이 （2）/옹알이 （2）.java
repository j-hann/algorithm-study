class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] speak = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < babbling.length; i++){
            String word = babbling[i];
            int index = 0;
            //이전 단어
            String previousWord = "";
            //단어가 매칭되는지 체크
            boolean isCorrect = true;
            
            while(index < word.length()){
                //speak 단어랑 일치하는지 체크
                boolean matched = false;
                
                //speak 배열 돌면서 word랑 일치하는지 체크
                for(int j = 0; j < speak.length; j++){
                    //비교할 단어 저장
                    String speakWord = speak[j];
                    
                    //word 문자 길이가 speakWord보다 크거나 같고, speakWord랑 일치하면
                    if(index + speakWord.length() <= word.length() && word.substring(index, index + speakWord.length()).equals(speakWord)){
                        
                        //연속되는 발음 나오면 for문 종료
                        if(speakWord.equals(previousWord)){
                            isCorrect = false;
                            //for문 종료
                            break;
                        }
                        
                        //이전 단어 갱신
                        previousWord = speakWord;
                        //단어 길이만큼 인덱스 이동
                        index = index + speakWord.length();
                        matched = true;
                        break;
                    }
                }
                
                //일치하는 speakWord 찾지 못하면
                if(!matched){
                    isCorrect = false;
                    //while문 종료
                    break;
                }
            }
            
            //단어랑 발음이 일치하면 카운트
            if(isCorrect){
                answer++;
            }   
        }
        
        return answer;
    }
}