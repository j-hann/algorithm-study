import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        //각 기능 완료된 날짜 저장
        Queue<Integer> q = new LinkedList<>();
        //배포마다 기능 개수 저장
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < speeds.length; i++) {
            //기능 완료까지 걸리는 날짜 계산하기 ->  (100 - 현재 진행률) / 개발 속도
            double remain = (100 - progresses[i]) / (double) speeds[i];
            //소수점 나오면 올림 처리
            int date = (int) Math.ceil(remain);

            //첫 번째 기능보다 큰 날짜가 나오면 배포 진행
            if (!q.isEmpty() && q.peek() < date) {
                //큐에 있는 모든 기능 한번에 배포됨
                answerList.add(q.size());
                //큐 초기화
                q.clear();
            }
            //현재 기능의 배포 날짜 추가
            q.offer(date);
        }

        //마지막으로 남은 기능들 처리
        answerList.add(q.size());

        //List를 int 배열로 변환
        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}