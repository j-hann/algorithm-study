
//[ 접근 방법 ]

//가로, 세로 변경했을 경우에도 생각해서 가장 최소의 직사각형 크기 retrun
//가장 큰 숫자는 -> w 너비가 되어야 함
//각 배열에서 가장 큰 숫자 -> 14, 19, 16, 18, 11 -> 내림차순 정렬 -> 19, 18, 16, 14, 11 -> 19 선택  
//각 배열에서 가장 작은 숫자 -> 4, 6, 6, 7, 7 -> 내림차순 정렬 -> 7, 7, 6, 6, 4

//=> 2차원 배열 순회하면서 최대값, 최소값 구하기
//안쪽 배열, 각 배열의 원소만 비교하면 됨

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        List<Integer> maxNumberList = Arrays.stream(sizes)
                .map(arr -> Math.max(arr[0], arr[1]))
                .collect(Collectors.toList());

        List<Integer> minNumberList = Arrays.stream(sizes)
                .map(arr -> Math.min(arr[0], arr[1]))
                .collect(Collectors.toList());

        int widthNumber = Collections.max(maxNumberList);
        int heightNumber = Collections.max(minNumberList);

        answer = widthNumber * heightNumber;

        return answer;
    }
}