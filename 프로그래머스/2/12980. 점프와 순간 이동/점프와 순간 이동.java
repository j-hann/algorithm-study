import java.util.*;

public class Solution {
	public int solution(int n){
        //건전지 사용량 최솟값
		int answer = 0;

        //이동 거리가 0보다 클 때까지 반복
		while(n > 0){
			//짝수면 순간이동
			if(n % 2 == 0){
				n = n / 2;
			}
			//홀수면 점프
			if(n % 2 == 1){
				n--;
                //건전지 사용
				answer++;
			}
		}
        
		return answer;
	}
}