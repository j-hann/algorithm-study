// 각 열 선택시 최대 점수 누적 계산

class Solution {
    int solution(int[][] land) {
        
        int n = land.length;
        
        //두번째 줄에서 마지막 줄까지 반복
        for (int i = 1; i < n; i++) {
            //현재 줄의 열을 계산
            for (int j = 0; j < 4; j++) {
                
                int max = 0;
                //이전 줄 열 순회하면서
                for (int k = 0; k < 4; k++) {
                    //바로 위 줄의 같은 열이 아니거나, 점수가 지금까지 최대값보다 크면
                    if (k != j && land[i - 1][k] > max) {
                        //최대값으로 저장
                        max = land[i - 1][k];
                    }
                }
                //누적 점수 더하기
                land[i][j] += max;
            }
        }

        // 마지막 줄에서 최대값 찾기
        int answer = land[n - 1][0];
        
        for (int i = 1; i < 4; i++) {
            //더 큰 점수가 있으면 넣어주기
            if (land[n - 1][i] > answer) {
                answer = land[n - 1][i];
            }
        }

        return answer;
    }
}