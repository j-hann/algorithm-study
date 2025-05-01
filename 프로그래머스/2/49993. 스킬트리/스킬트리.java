import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = -1;
        //가능한 스킬트리 개수 카운트
        int count = 0;
        
        //스킬트리 배열 돌면서 하나씩 체크
        for(String skillTree : skill_trees){
            Queue<Character> queueSkill = new LinkedList<>();
            
            //스킬 한글자씩 꺼내서 큐에 넣기
            for(char skillChar : skill.toCharArray()){
                queueSkill.offer(skillChar);
            } 
            
            //스킬트리 유효한지 체크하는 변수 선언
            boolean isVaild = true;
        
            //스킬트리 한글자씩 체크
            for(char skillTreeChar : skillTree.toCharArray()){
                
                //큐에 해당 스킬트리 문자가 포함되어있는데
                if(queueSkill.contains(skillTreeChar)){
                    //큐 맨 앞의 스킬이랑 스킬트리 문자랑 일치하지 않을 경우
                    if(skillTreeChar != queueSkill.poll()){
                        isVaild = false;
                        break;
                    }
                }
            }
            
            //스킬트리 유효하면 카운트
            if (isVaild) {
                count++;
            }
            
        } 
        
        answer = count;
        return answer;
    }
}