package programmers.lesson.lesson42579;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solution() {
        String[] genres = new String[]{"classic", "pop", "classic", "classic", "pop"};
        int[] plays = new int[]{500, 600, 150, 800, 2500};

        int[] result = new Solution().solution(genres, plays);
        Assertions.assertArrayEquals(new int[]{4, 1, 3, 0}, result);
    }

}