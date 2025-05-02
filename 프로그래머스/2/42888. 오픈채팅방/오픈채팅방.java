import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> nicknameMap = new HashMap<>();
        List<String[]> logList = new ArrayList<>();
        
        for(String rec : record){
            //띄어쓰기로 단어, uid, 닉네임 분리
            String[] str = rec.split(" ");
            String word = str[0];  
            String uid = str[1];
            
            if (word.equals("Enter") || word.equals("Change")) {
                String nickname = str[2];
                //새로운 닉네임 저장
                nicknameMap.put(uid, nickname);
            }
            
            if (word.equals("Enter") || word.equals("Leave")) {
                //로그 저장
                logList.add(new String[]{word, uid}); 
            }            
        }
        
        //로그 개수만큼 결과 메세지 배열 생성
        String[] answer = new String[logList.size()];
        
        int index = 0;
        
        for (String[] logs : logList) {
            
            String word = logs[0];
            String uid = logs[1];
            String nickname = nicknameMap.get(uid);
            
            if (word.equals("Enter")) {
                answer[index++] = nickname + "님이 들어왔습니다.";
            } else if(word.equals("Leave")){                
                answer[index++] = nickname + "님이 나갔습니다.";
            }
        }

        return answer;
    }
}