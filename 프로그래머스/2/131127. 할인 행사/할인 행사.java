import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
		int answer = 0;
		Map<String, Integer> wantMap = new HashMap<>();

		//want 길이만큼 반복하면서 want에 있는 상품과 각 개수를 hashMap에 저장
		for(int i = 0; i < want.length; i++){
			wantMap.put(want[i], number[i]);
		}

		//슬라이딩 윈도우 기법으로 하나씩 다음으로 이동하면서 discount 배열 체크해야함
		for(int i = 0; i <= discount.length - 10; i ++){
			Map<String, Integer> discountMap = new HashMap<>();

			//i일 부터 10일 동안의 할인 상품 체크
			for (int j = i; j < i + 10; j++) {
				//현재 날짜 할인 상품이 discountMap에 존재하면 기존 개수 + 1, 아니면 0 + 1
				discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
			}

			//두 개의 HashMap을 비교 -> wantMap과 discountMap이 동일한지 체크
			if (wantMap.equals(discountMap)) {
				//조건 충족되면 카운트
				answer++;
			}
		}
		return answer;
    }
}