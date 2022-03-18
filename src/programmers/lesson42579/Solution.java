package programmers.lesson42579;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        Map<String, Integer> genresCount = new HashMap<String, Integer>();
        for (int i = 0; i < plays.length; i++) {
            int cnt = genresCount.getOrDefault(genres[i], 0) + plays[i];
            genresCount.put(genres[i], cnt);
        }




        return answer;
    }
}