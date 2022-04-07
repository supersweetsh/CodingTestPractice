package programmers.lesson.lesson42586;

//        int[] progresses = new int[]{93, 30, 55};
//        int[] speeds = new int[]{1, 30, 5};
//        int[] answer = new int[]{2, 1};

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> work = new ArrayList<>();
        for (int idx = 0; idx < progresses.length; idx++) {

            int timeToDone = (int) Math.ceil((100 - progresses[idx]) / (double)speeds[idx]);
            work.add(timeToDone);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < work.size(); i++) {
            int current = work.get(i);

            int jobs = 1;
            for (int j = i + 1; j < work.size(); j++) {
                int nextVal = work.get(j);

                if (current < nextVal) {
                    break;
                }
                else {
                    jobs += 1;
                    i = j;
                }
            }
            result.add(jobs);
        }

        return result.stream().mapToInt(i->i).toArray();
    }
}