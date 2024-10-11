package programmers.challenge;

/**
 * 문제제목: 숨어있는 숫자의 덧셈
 * 작 성 일: 2024.09.15
 * 작 성 자: YUN YOUNG
 * 문제설명: 문자열 my_string 이 매개변수로 주어집니다. my_string 안의 모든 자연수들의 합을
 * return 하도록 solution 함수를 완성해주세요.
 */
public class AdditionOfHiddenNumbers {
   public static void main(String[] args) {
      System.out.println(solution("aAb1B2cC34oOp"));
      System.out.println(solution("1a2b3c4d123"));
   }

   private static int solution(String my_string) {
      int answer = 0;
      char[] charArray = my_string.toCharArray();

      for (char c : charArray) {
         if (c >= '0' && c <= '9') {
            answer += c - '0';
         }
      }
      return answer;
   }
}
