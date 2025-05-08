import java.util.Stack;

class Solution {
    public int solution(int[] order) {
        //트럭에 실을 수 있는 상자 개수
        int answer = 0;
        //보조 컨테이너 벨트 스택 - 바로 실을 수 없는 상자 보관
        Stack<Integer> beltStack = new Stack<>();
        //벨트에서 나오는 상자 번호
        int boxNumber = 1;
        //기사님이 원하는 상자 번호
        int orderIndex = 0;
        
        while(true){
            
            //벨트 상자 번호랑 기사님이 원하는 상자 번호랑 같으면
            if(orderIndex < order.length && boxNumber == order[orderIndex]){
              answer++;
              boxNumber++;
              orderIndex++;
            } else if(!beltStack.isEmpty() && beltStack.peek() == order[orderIndex]){
            //보조 컨테이너 벨트 상자랑 기사님이 원하는 상자 번호랑 같으면
            
                //스택에서 꺼내기
                beltStack.pop();
                answer++;
                orderIndex++;
                
            } else if(boxNumber <= order.length){
            //벨트에서 상자가 더 나올 경우
            
                //스택에 보관
                beltStack.push(boxNumber++);
            } else {
            
                //벨트에 상자도 없고 스택에도 원하는 상자 없을 경우
                break;
            }
        }
        
        
        return answer;
    }
}