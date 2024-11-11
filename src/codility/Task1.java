package codility;

import java.util.Arrays;

/**
 * title: Task 1
 * date: 2024.11.11
 * author: yun young
 * description: 정수 N개로 이루어진 배열 A가 주어집니다.
 * 한 번의 움직임(move)으로, 배열 A에서 숫자 하나를 선택하고 그 숫자를 각 자리수의 합으로 교체할 수 있습니다.
 * 하나의 숫자는 여러번 선택할 수 있습니다. 최대 두 번의 움직임을 사용할 수 있습니다.
 * 이때, 배열의 합을 최소로 만들 수 있는 경우를 찾으세요.
 *
 * Example
 * 입력: A = [1, 10, 12, 3]
 *
 * 두 번째와 세 번째 요소에 움직임을 적용할 수 있습니다.
 * 그러면 A = [1, 1, 3, 3]이 되고, 배열의 합은 8이 됩니다.
 * 출력: 8
 * 입력: A = [2, 29, 3]
 *
 * 두 번의 움직임을 모두 두 번째 요소에 적용할 수 있습니다.
 * 그러면 A = [2, 2, 3]이 되고, 배열의 합은 7이 됩니다.
 * 출력: 7
 * 입력: A = [100, 101, 102, 103]
 *
 * 첫 번째와 두 번째 요소에 움직임을 적용할 수 있습니다.
 * 그러면 A = [1, 2, 102, 103]이 되고, 배열의 합은 208이 됩니다.
 * 출력: 208
 * 입력: A = [55]
 *
 * 첫 번째 요소에 두 번의 움직임을 적용할 수 있습니다.
 * 그러면 A = [1]이 되고, 배열의 합은 1이 됩니다.
 * 출력: 1
 * 제약 사항
 * N은 [1..50,000] 범위의 정수입니다.
 * 배열 A의 각 요소는 [1..10,000] 범위의 정수입니다.
 * 요구 사항
 * 효율적인 알고리즘을 작성해야 합니다.
 *
 * 문제 풀이 전략
 * 이 문제는 최대 두 번의 움직임(move)를 사용해 배열의 합을 최소화하는 것 입니다.
 *
 * 1. 자리수 합(Digit Sum) 게산 함수 작성
 *    먼저, 각 숫자의 자리수 합을 계산하는 함수를 작성합니다.
 *    예를 들어 29는 2 + 9 = 11, 101은 1 + 0 + 1 = 2가 됩니다.
 * 2. 가장 큰 감소량을 찾는 전략
 *    두 번의 움직임을 적용할 수 있으므로 가장 큰 감소량을 두 번 적용하는 것이 최적의 선택입니다.
 * 3. 최대 두 번의 감소량을 적용
 *    모든 요소에 대해 계산된 감소량 중 최대값을 두 번 선태가여 최소 합을 계산합니다.
 *
 * 알고리즘 설명
 * 1. 배열의 합을 먼저 계산합니다.
 * 2. 각 요소의 감소량을 계산하고 이를 리스트에 저장합니다.
 * 3. 리스트에서 가장 큰 두 개의 감소량을 선택해 합에서 빼줍니다.
 * 4. 최소 합을 반환합니다.
 *
 */
public class Task1 {

    public static void main(String[] args) {
        int[] array1 = {1,10,12,3};
        System.out.println(solution(array1));

        int[] array2 = {2,29,3};
        System.out.println(solution(array2));

        int[] array3 = {100, 101, 102, 103};
        System.out.println(solution(array3));

        int[] array4 = {55};
        System.out.println(solution(array4));
    }

    /**
     * Solution
     * 1. 초기 합 계산: totalSum에 배열의 초기 합을 구한다.
     * 2. 변환 후 최소값 및 감소량 계산
     *    각 요소 A[i]에 대해 두 번의 변환으로 얻을 수 있는 최소값 minValue 와 그 감소량 A[i] - minValue를 저장한다.
     *    reductions 배열의 각 요소에는 [감소량, 변환 후 최소값]의 형태로 저장한다.
     * 3 감소량 기준으로 정렬
     *    reductions 배열을 감소량 기준으로 내림차순 정렬하여 가장 큰 감소를 가져오는 두 요소를 선택한다.
     * 4. 감소량 적용
     *    상위 두 개의 감소량을 totalSum에서 뺀다.
     */
    private static int solution(int[] A) {
        int totalSum = Arrays.stream(A).sum();  // 배열의 초기 합계 계산
        int[][] reductions = new int[A.length][2];

        // 각 요소에 대해 두 번의 변환 후 최소값 및 감소량 계산
        for (int i = 0; i < A.length; i++) {
            int firstTransform = digitSum(A[i]);
            int secondTransform = digitSum(firstTransform);
            int minValue = Math.min(A[i], Math.min(firstTransform, secondTransform));

            reductions[i][0] = A[i] - minValue; // 감소량 저장
            reductions[i][1] = minValue;        // 최종 최소값 저장
        }

        // 감소량 기준으로 내림차순 정렬하여 상위 두 개 선택
        Arrays.sort(reductions, (a,b) -> Integer.compare(b[0], a[0]));

        // 최대 두 개의 변환 후 감소량을 총합에 반영
        if (A.length > 0) totalSum -= reductions[0][0];
        if (A.length > 1) totalSum -= reductions[1][0];

        return totalSum;
    }

    // 자릿수 합을 계산하는 함수
    private static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
