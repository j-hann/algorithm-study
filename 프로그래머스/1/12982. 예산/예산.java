import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int count = 0;
        //오름차순 정렬
        Arrays.sort(d);
        //부서 전체 예산 누적
        int departmentBudgetSum = 0;
            
        for(int i = 0; i < d.length; i++){
            //현재 부서 예산 신청 금액
            int targetDepartment = d[i];
            
            //부서 예산 더하기
            int targetDepartmentSum = departmentBudgetSum + targetDepartment;

            //예산 초과시 종료
            if(budget < targetDepartmentSum){
                answer = count;        
                break;
            }
            
            //누적합 갱신하기
            departmentBudgetSum = targetDepartmentSum;
            count++;
            answer = count; 
        }
        
        return answer;
    }
}