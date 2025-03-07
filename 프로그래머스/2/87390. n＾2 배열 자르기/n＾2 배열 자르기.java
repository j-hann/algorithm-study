class Solution {
    public int[] solution(int n, long left, long right) {
		//결과 배열 크기
		int resultSize = (int) (right - left + 1);
		int[] answer = new int[resultSize];

		// 현재 인덱스를 left로 시작
		long currentIndex = left;
		for (int i = 0; i < resultSize; i++, currentIndex++) {
			//몇번째 행인지
			int row = (int) (currentIndex / n);
			//몇번째 열인지
			int col = (int) (currentIndex % n);
			//특정 위치 행과 열의 값 구하기
			answer[i] = Math.max(row, col) + 1;
		}

		return answer;
    }
}