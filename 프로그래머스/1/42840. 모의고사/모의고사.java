import java.util.*;

class Solution {

	public int[] solution(int[] answers) {
		int[] answer = {};

		int[] first = new int[]{1, 2, 3, 4, 5};
		int[] second = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
		int[] third = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

		//정답 개수 카운트
		int[] count = new int[3];

		//가장 높은 점수 저장
		int maxCount = 0;
		List<Integer> topScore = new ArrayList<>();

		//정답 채점
		for (int i = 0; i < answers.length; i++) {
			//나머지 통해서 패턴 반복 & 카운트
			if (answers[i] == first[i % first.length]) {
				count[0]++;
			}
			if (answers[i] == second[i % second.length]) {
				count[1]++;
			}
			if (answers[i] == third[i % third.length]) {
				count[2]++;
			}
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] > maxCount) {
				//가장 높은 점수 저장
				maxCount = count[i];
				//기존 리스트 초기화
				topScore.clear();
				//새롭게 높은 점수 받은 사람 추가
				topScore.add(i + 1);
			} else if (count[i] == maxCount) {
				//기존의 가장 높은 점수랑 같으면 추가
				topScore.add(i + 1);
			}
		}

		//리스트 -> int 배열로 변환
		answer = new int[topScore.size()];

		for (int i = 0; i < topScore.size(); i++) {
			answer[i] = topScore.get(i);
		}

		return answer;
	}
}
