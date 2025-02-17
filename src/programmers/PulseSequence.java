package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 접근법
 * 펄스 수열은 1과 -1이 번갈아 나오는 수열
 * 주어진 숫자 배열에서 연속된 부분을 뽑고 같은 길이의 펄스 수열을 곱한 후, 그 값들의 합이 가장 큰 것을 찾는 것
 *
 * 어떤 알고리즘을 써야할까?
 * 카데인 알고리즘을 써야한다.
 *
 * 카데인 알고리즘은 연속된 숫자들의 합이 가장 큰 경우를 찾는 알고리즘이다.
 * 1. 펄스 수열을 적용한 두 개의 배열을 만든다.
 * 2. 각 배열에서 연속된 부분의 최대 합을 찾는다.
 * 3. 둘 중 더 큰 값을 정답으로 출력한다.
 *
 * 이 알고리즘은 O(N)으로 한번만 배열을 순회해서 아주 빠르다.
 */
public class PulseSequence {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력을 받아서 배열로 변환
        // 배열의 길이를 n이라고 할때 O(n) 시간에 수행됨
        int[] array = Arrays.stream(br.readLine().split(","))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(findMaxPulseSubSequenceSum(array));
    }

    /**
     * 두개의 펄스 수열을 적용하여 최대 부분합을 찾는 함수
     */
    private static int findMaxPulseSubSequenceSum(int[] array) {
        int n = array.length;

        // 1. 두개의 펄스 배열을 생성
        int[] pulse1 = new int[n];
        int[] pulse2 = new int[n];

        // 입력 배열의 각 원소를 순회하며 적용하는 루프가 있음
        // 이 루프는 배열의 모든 요소(n)를 한번씩 처리하므로 O(n)
        // 펄스 수열 2종류에 대해 각각 호출되므로 2 * O(n) = O(n)
        for (int i = 0; i < n; i++) {
            pulse1[i] = array[i] * (i % 2 == 0 ? 1: -1);
            pulse2[i] = array[i] * (i % 2 == 0 ? -1 : 1);
        }

        // 2. 두 경우에서 최대 부분 수열 합을 찾고 최댓값 반환
        return Math.max(findMaxSubarraySum(pulse1), findMaxSubarraySum(pulse2));
    }

    // 카데인 알고리즘
    // 연속된 숫자들의 부분합 중 가장 큰 값을 찾는 알고리즘
    // 시간 복잡도는 O(N)으로 효율적
    private static int findMaxSubarraySum(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];

        // 배열을 한번씩 순회하며 현재 합과 최대 합을 업데이트 O(n)
        // Math.max로 비교하는 연산은 상수시간 O(1)
        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            // 최대값 업데이트
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
