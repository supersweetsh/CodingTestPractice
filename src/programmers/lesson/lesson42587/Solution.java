package programmers.lesson.lesson42587;

import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {

//        Queue<Integer> queue = new LinkedList<>(Arrays.stream(priorities).mapToObj(i->(Integer)i).toList());

        Queue<Integer> queue = new LinkedList<>();
        for (int priority : priorities) {
            queue.offer(priority);
        }
        int printedCount = 0;
        boolean foundHigherPriority = false;
        while (!queue.isEmpty()) {
            foundHigherPriority = false;
            int current = queue.poll();
            location -= 1;

            for (Integer v : queue) {
                if (current < (int) v) {
                    foundHigherPriority = true;
                    break;
                }
            }

            if (foundHigherPriority) {
                queue.offer(current);
                if (location < 0) {
                    location = queue.size() - 1;
                }
            }
            else {
                printedCount += 1;
                if (location < 0) {
                    break;
                }
            }
        }

        return  printedCount;
    }
}
