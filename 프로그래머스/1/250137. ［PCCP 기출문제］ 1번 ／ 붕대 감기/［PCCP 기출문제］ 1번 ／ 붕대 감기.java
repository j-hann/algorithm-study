import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
         int answer = health;
         int[] time = new int[attacks[attacks.length - 1][0] + 1];
 
         for (int i = 0; i < attacks.length; i++) {
             time[attacks[i][0]] -= attacks[i][1];
         }
 
         int cursor = 1;
         while (cursor < time.length) {
             if (time[cursor] < 0) {
                 cursor++;
                 continue;
             }
 
             int band = 0;
             while (time[cursor] == 0) {
                 band++;
                 time[cursor] += bandage[1];
                 if (band == bandage[0]) {
                     time[cursor] += bandage[2];
                     cursor++;
                     break;
                 }
                 cursor++;
             }
         }
 
         for (int i = 0; i < time.length; i++) {
             if (answer >= health) {
                 answer = health;
             }
             answer += time[i];
             if (answer <= 0) {
                 return -1;
             }
         }
 
         return answer;
    }
}