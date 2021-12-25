package programmers.level.one;

/**
 * 문제제목 : 숫자 문자열과 영단어
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/81301
 * 작 성 일 : 2021.12.25
 * 작 성 자 : YUN YOUNG
 *
 * 문제설명 : 네오와 프로도가 숫자놀이를 하고 있습니다. 네오가 프로도에게 숫자를 건널 때
 * 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.
 *
 * 다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.
 *
 * 1478   -> "one4seveneight"
 * 234567 -> "23four5six7"
 * 10203  -> "1zerotwozero3"
 *
 * 이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다.
 * s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 <= s 의 길이 <= 50
 * s가 "zero" 또는 "0"으로 시작하는 경우는 주어지지 않습니다.
 * return 값이 1 이상 2,000,000,000 이하의 정수가 되는 올바른 입력만 s로 주어집니다.
 */
public class NumberStringAndEnglishWord {
    public static void main(String[] args) {
        String s = "one4seveneight";
        NumberStringAndEnglishWord numberStringAndEnglishWord = new NumberStringAndEnglishWord();
        numberStringAndEnglishWord.solution(s);
    }

    public int solution(String s) {
        if (s.contains("zero")) {
            s = s.replaceAll("zero", "0");
        }
        if (s.contains("one")) {
            s = s.replaceAll("one", "1");
        }
        if (s.contains("two")) {
            s = s.replaceAll("two", "2");
        }
        if (s.contains("three")) {
            s = s.replaceAll("three", "3");
        }
        if (s.contains("four")) {
            s = s.replaceAll("four", "4");
        }
        if (s.contains("five")) {
            s = s.replaceAll("five", "5");
        }
        if (s.contains("six")) {
            s = s.replaceAll("six", "6");
        }
        if (s.contains("seven")) {
           s = s.replaceAll("seven", "7");
        }
        if (s.contains("eight")) {
            s = s.replaceAll("eight", "8");
        }
        if (s.contains("nine")) {
            s = s.replaceAll("nine", "9");
        }
        return Integer.parseInt(s);
    }
}
