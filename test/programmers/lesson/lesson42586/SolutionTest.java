package programmers.lesson.lesson42586;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solution1() {
        int[] progresses = new int[]{93, 30, 55};
        int[] speeds = new int[]{1, 30, 5};
        int[] answer = new int[]{2, 1};

        int[] result = new Solution().solution(progresses, speeds);
        Assertions.assertArrayEquals(answer, result);
    }

    @Test
    void solution2() {
        int[] progresses = new int[]{95, 90, 99, 99, 80, 99};
        int[] speeds = new int[]{1, 1, 1, 1, 1, 1};
        int[] answer = new int[]{1, 3, 2};

        int[] result = new Solution().solution(progresses, speeds);
        Assertions.assertArrayEquals(answer, result);
    }
}