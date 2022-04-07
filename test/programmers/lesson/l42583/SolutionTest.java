package programmers.lesson.l42583;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {

    private static Stream<Arguments> methodSource() {
        return Stream.of(
                Arguments.of(2, 10, new int[]{7,4,5,6}, 8),
                Arguments.of(100, 100, new int[]{10}, 101),
                Arguments.of(100, 100, new int[]{10,10,10,10,10,10,10,10,10,10}, 110)
        );
    }

    @ParameterizedTest
    @MethodSource("methodSource")
    void solution(int bridge_length, int weight, int[] truck_weights, int result) {
        Assertions.assertEquals(new Solution().solution(bridge_length, weight, truck_weights), result);
    }
}