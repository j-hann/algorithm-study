//[접근 방법]

//구명보트 최대 2명 탑승 가능, 무게는 limit 이하 
//가장 무거운 사람이 가장 가벼운 사람이랑도 못타면 -> 혼자 타야함

//그리디 알고리즘
//사람 오름차순 정렬
//가장 작은 수랑 큰 숫자를 짝지어서 조건 만족 시키는지 확인, 두 합이 limit보다 작은지 체크
//투포인터 방식으로 양쪽에서 인덱스 이동하면서 체크, 인덱스가 같아질 때까지 카운트 하면서 반복
//무게가 limit 이상이면 끝 인덱스 왼쪽으로 이동
//limit보다 같거나 작으면 첫 인덱스도 오른쪽으로 이동

import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int lightWeightIndex = 0;
        int heavyWeightIndex = people.length-1;

        Arrays.sort(people);

        while(lightWeightIndex <= heavyWeightIndex){

            if(people[lightWeightIndex] +  people[heavyWeightIndex] <= limit){
                lightWeightIndex++;
            }

            heavyWeightIndex--;
            answer++;
        }

        return answer;
    }
}
