package programmers.lesson.lesson42587;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {

    private static Stream<Arguments> methodSource() {
        return Stream.of(
                Arguments.of(new int[]{2, 1, 3, 2}, 2, 1),
                Arguments.of(new int[]{1, 1, 9, 1, 1, 1}, 0, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("methodSource")
    void solution(int[] priorities, int location, int result) {
        Assertions.assertEquals(new Solution().solution(priorities, location), result);
    }
}