import java.util.Arrays;
class Solution {
 public int solution(int[] citations) {
		 
	        int answer = 0;
	    
            //논문 인용 횟수 오름차순 정렬 -> 가장 큰 h값 찾기
	        Arrays.sort(citations);
	        
            //citations 길이만큼 돌면서 H-Index 찾기
	        for(int i = 0; i < citations.length; i++) {
                
	        	//현재 논문을 기준으로 남은 논문 개수 계산
	        	int h = citations.length-i;
	        
                //현재 논문 인용 횟수가 h 이상이면
	        	if(citations[i] >= h) {
                    //H-Index
	        		answer = h;
	        		break;
	        	}
	        }
	        
	        return answer;
	        
	    }
}