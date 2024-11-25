package programmers.challenge.level0;

import java.util.HashMap;
import java.util.Map;

/**
 * title: 모스부호(1)
 * date: 2024.11.25
 * author: YUN YOUNG
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/120838
 * description: 머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다.
 * 그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다. 문자열 letter가 매개변수로 주어질 때,
 * letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
 */
public class Morse {

    public static final String[][] MORSE = new String[][]{
            {".-", "a"},    {"-...", "b"}, {"-.-.", "c"}, {"-..", "d"}, {".", "e"},
            {"..-.", "f"},  {"--.", "g"},  {"....", "h"}, {"..", "i"},  {".---", "j"},
            {"-.-", "k"},   {".-..", "l"}, {"--", "m"},   {"-.", "n"},  {"---", "o"},
            {".--.", "p"},  {"--.-", "q"}, {".-.", "r"},  {"...", "s"}, {"-", "t"},
            {"..-", "u"},   {"...-", "v"}, {".--", "w"},  {"-..-", "x"}, {"-.--", "y"},
            {"--..", "z"}
    };

    public static void main(String[] args) {
        String letters1 = ".... . .-.. .-.. ---";
        System.out.println(translateMorse(letters1));

        String letters2 = ".--. -.-- - .... --- -.";
        System.out.println(translateMorse(letters2));
    }

    private static String translateMorse(String letters) {
        Map<String, String> morseMap = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (String[] pair : MORSE) {
            morseMap.put(pair[0], pair[1]);
        }

        String[] letter = letters.split(" ");
        for (int i = 0; i < letter.length; i++) {
            result.append(morseMap.get(letter[i]));
        }
        return result.toString();
    }
}
