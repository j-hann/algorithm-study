import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
		int answer = 0;
		//섞은 음식의 스코빌 지수
		int mixedFoodScoville = 0;
		//K보다 작은 음식 스코빌 지수 - 우선순위 큐 사용 -> 가장 작은 값이 맨 앞
		PriorityQueue<Integer> foodScovilleQueue = new PriorityQueue<>();

		for(int i = 0; i < scoville.length; i++){
			foodScovilleQueue.offer(scoville[i]);
		}

		//foodScovilleQueue 값이 2보다 같거나 클 경우, 코빌 지수 낮은 두개 음식 섞기
		while (foodScovilleQueue.size() >= 2 && foodScovilleQueue.peek() < K){

			//가장 맵지 않은 음식의 스코빌 지수
			int LeastSpicyFood = foodScovilleQueue.poll();
			//두 번째로 맵지 않은 음식의 스코빌 지수
			int SecondLeastSpicyFood = foodScovilleQueue.poll();

			mixedFoodScoville = LeastSpicyFood + (SecondLeastSpicyFood * 2);
			//섞은 음식의 스코빌 지수 추가
			foodScovilleQueue.offer(mixedFoodScoville);

			//카운트
			answer++;
		}

		//값이 하나있는데 K보다 작으면
		if(foodScovilleQueue.size() == 1 && foodScovilleQueue.peek() < K){
			answer = -1;
			return answer;
		}

		//최소 횟수 반환
		return answer;
	}
}