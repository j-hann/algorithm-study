class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
		//전체 타일 수
		int totalTile = brown + yellow;

		//brown 8개 이상 -> 3 * 3 -> 최소 3부터 시작
		for(int height = 3; height <= totalTile; height++){
			//전체 타일를 세로 길이로 나눴을때 나머지가 0이라면 -> 약수
			if(totalTile % height == 0){
				int width = totalTile / height;

				//yellow 타일 -> 가장자리 제외하고 남은 부분 좌우 한칸씩 빼면 (width - 2)
				// 세로 길이 위아래 한칸씩 빼면 (height-2)
				if((width - 2) * (height - 2) == yellow){
					answer[0] = width;
					answer[1] = height;

					break;
				}
			}
		}

		return answer;
    }
}