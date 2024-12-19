package programmers.challenge.level0;

/**
 * title: 꼬리 문자열
 * date: 2024.12.19
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181841
 */
public class TailString {
    public static void main(String[] args) {
        System.out.println(makeTailString(new String[]{"abc", "def", "ghi"}, "ef"));
        System.out.println(makeTailString(new String[]{"abc", "bbc", "cbc"}, "c"));
    }

    private static String makeTailString(String[] strList, String ex) {
        StringBuilder result = new StringBuilder();

        for (String str : strList) {
            if (!str.contains(ex)) {
                result.append(str);
            }
        }
        return result.toString();
    }
}
