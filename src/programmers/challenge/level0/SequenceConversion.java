package programmers.challenge.level0;

/**
 * title: 조건에 맞게 수열 변환하기1
 * date: 2024.12.07
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181882
 */
public class SequenceConversion {
    public static void main(String[] args) {
        SequenceConversion sequenceConversion = new SequenceConversion();
        int[] arr = {1, 2, 3, 100, 99, 98};
        int[] result = sequenceConversion.convert(arr);
    }

    private int[] convert(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] >= 50) {
                arr[i] = arr[i] / 2;
            } else if (arr[i] % 2 != 0 && arr[i] < 50) {
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }
}
