package programmers.challenge.level0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CollatzSequence2 {
    public static void main(String[] args) {
        int n = 10;
        int[] result = collatzSequence(n);
        System.out.println(Arrays.toString(result));
    }

    private static int[] collatzSequence(int n) {
        return IntStream.concat(
            IntStream.iterate(n, i -> i != 1, i -> (i % 2 == 0) ? i / 2 : 3 * i + 1),
            IntStream.of(1)
        ).toArray();
    }
}
