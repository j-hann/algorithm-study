class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
	    //arr1 행의개수
		int rows1 = arr1.length;
		//arr1 열의 개수 = arr2의 행의 개수
		int cols1 = arr1[0].length;
		//arr2의 열의 개수
		int cols2 = arr2[0].length;

		//행렬 크기
		int[][] answer = new int[rows1][cols2];

		//행렬 곱셈
		//arr1의 행 순회
		for(int row = 0; row < rows1; row++){
			//arr2의 열 순회
			for(int col = 0; col < cols2; col++){
				//곱해야하는 요소 -> arr1 열의 개수 = arr2 행의 개수
				for(int i = 0; i < cols1; i++){
					answer[row][col] = answer[row][col] + (arr1[row][i] * arr2[i][col]);
				}
			}
		}

		return answer;
    }
}