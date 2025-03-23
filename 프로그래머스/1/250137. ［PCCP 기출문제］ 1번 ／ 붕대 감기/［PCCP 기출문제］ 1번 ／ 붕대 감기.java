import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        //연속 성공 시간 -> t만큼 도달하면 y만큼 체력 회복하기
		int consecutiveTime = 0;
		//최대 체력
		int maxHealth = health;
		//붕대 감기 기술
		int t = bandage[0];
		//초당 체력 회복량
		int x = bandage[1];
		//추가 체력 회복량
		int y = bandage[2];
		//배열 마지막 인덱스 저장 -> 마지막 공격 시간까지 반복문 돌리기 위해서
		int lastAttackTime = attacks[attacks.length - 1][0];

		//공격 정보 시간순으로 저장
		Queue<int[]> queue = new LinkedList<>();

		//몬스터 공격 시간, 피해량 저장
		for (int[] attack : attacks) {
			queue.add(attack);
		}

		//현재 시간 1초부터 마지막 공격 시간까지 반복문 돌리기 -> 마지막 공격시간 이후에는 피해량이 없으니까
		for (int currentTime = 1; currentTime <= lastAttackTime; currentTime++) {
			//공격 시간
			int attackTime = queue.peek()[0];
			//피해량
			int attackDamage = queue.peek()[1];

			//1초부터 반복문 돌면서 공격시간과 동일해지면
			if (currentTime == attackTime) {
				//현재 체력에서 피해량을 빼기
				health = health - attackDamage;
				//연속 회복 실패 -> 카운트 리셋
				consecutiveTime = 0;
				//몬스터 공격 처리 완료 -> 큐에서 제거 -> 선입 선출이니까 맨 처음 저장한 값이 삭제됨
				queue.remove();
			} else {
				//몬스터 공격 시간이 아닐 경우 + 1씩 증가하기 -> 연속 붕대감기 성공
				consecutiveTime = consecutiveTime + 1;
				//초당 회복량 만큼 체력 회복
				health = health + x;

				//만약 연속 붕대 감기가 성공했을 경우 -> 추가 체력 회복
				if (consecutiveTime == t) {
					//추가 체력 회복
					health = health + y;
					//추가 체력 회복했으니까 -> 연속 회복 카운트 리셋
					consecutiveTime = 0;
				}
			}

			//현재 체력이 최대 체력 초과일 경우
			if (health > maxHealth) {
				//다시 현재 체력으로 저장
				health = maxHealth;
			}

			//현재 체력이 0보다 작으면
			if (health <= 0) {
				return -1;
			}
		}

		//캐릭터 체력 반환
		return health;
    }
}