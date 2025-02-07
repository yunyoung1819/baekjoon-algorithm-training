package programmers.challenge.level0;


/**
 * title: 글자 지우기
 * date: 2025.02.07
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181900
 */
public class RemoveLetter {
    public static void main(String[] args) {
        String my_string = "apporoograpemmemprs";
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};

        String result = solution(my_string, indices);
        System.out.println(result);
    }

    private static String solution(String my_string, int[] indices) {
        boolean[] removalIndex = new boolean[my_string.length()];

        for (int i = 0; i < indices.length; i++) {
            int index = indices[i];
            removalIndex[index] = true;
        }

        String result = "";
        for (int j = 0; j < my_string.length(); j++) {
            if (removalIndex[j]) {
                continue;
            }
            result += my_string.charAt(j);
        }
        return result;
    }
}
