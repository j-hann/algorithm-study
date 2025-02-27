import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
 		//귤 정렬
		Arrays.sort(tangerine);
		//크기가 서로 다른 종류의 수의 최솟값
		int answer = 0;

		List<Integer> countTangerineList = new ArrayList<>();
		int count = 1;
		//총 선택한 귤 개수
		int totalCount = 0;

		//같은 크기 귤 개수 세기
		for(int i = 1; i < tangerine.length; i++){
			//같은 크기의 귤이면 카운트
			if(tangerine[i] == tangerine[i - 1]){
				count++;
			} else {
				//다른 크기 귤이면 count 한거 List에 저장
				countTangerineList.add(count);
				//초기화
				count = 1;
			}
		}
		//마지막 귤 크기 개수 카운트
		countTangerineList.add(count);

		//개수 많은 순서대로 내림차순 정렬
		countTangerineList.sort(Collections.reverseOrder());

		//k개 만큼 고르기
		for(int i = 0; i < countTangerineList.size(); i++){
			totalCount = totalCount + countTangerineList.get(i);
			answer++;

			//총 개수가 k개 이상이면
			if(totalCount >= k){
				break;
			}
		}

		return answer;
    }
}