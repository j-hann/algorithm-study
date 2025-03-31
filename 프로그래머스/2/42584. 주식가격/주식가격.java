import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];

		for(int i = 0; i < prices.length; i++){
			//카운트
			int count = 0;
			//현재 값
			int currentPrice = prices[i];

			//현재 가격이 이후 가격보다 작거나 같으면
			for (int j = i + 1; j < prices.length; j++) {
				count++;
				
				//가격이 떨어지면
				if (prices[j] < currentPrice) {
					break;
				}
			}
			
			answer[i] = count;
		}

		return answer;
	}
}