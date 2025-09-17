package programmers.challenge.level0;

/**
 * 문제제목: 코드 처리하기
 * 작 성 일: 2025.09.17
 * 작 성 자: Yun Young
 * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/181932
 * 문제설명: 문자열 code가 주어집니다. code를 앞에서부터 읽으면서 만약 문자가 "1"이면 mode를 바꿉니다.
 * mode에 따라 code를 읽어가면서 문자열 ret을 만들어냅니다.
 * mode는 0과 1이 있으며 idx를 0부터 code의 길이 -1까지 1씩 키워나가면서 code[idx]의 값에 따라 다음과 같이 행동합니다.
 * <p>
 * mode가 0일때 code[idx]가 "1"이 아니면 idx가 짝수일때만 ret의 맨 뒤에 code[idx]를 추가합니다. code[idx]가 "1"이면 mode를 0에서
 * 1로 바꿉니다.
 * <p>
 * mode가 1일때 code[idx]가 "1"이 아니면 idx가 홀수일때만 ret의 맨 뒤에 code[idx]를 추가합니다.
 * code[idx]가 "1"이면 mode를 1에서 0으로 바꿉니다. 문자열 code를 통해 만들어진 문자열 ret를 return 하는 solution 함수를 완성해주세요.
 * 단, 시작할 때 mode는 0이며, return 하려는 ret가 만약 빈 문자열이라면 대신 "EMPTY"를 return 합니다.
 */
public class ProcessCode {
    public static void main(String[] args) {
        String code = "abc1abc1abc";
        String result = solution(code);
        System.out.println(result);
    }

    private static String solution(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (c == '1') {
                mode = 1 - mode;
                continue;
            }
            if (mode == 0) {
                if (i % 2 == 0) {
                    ret.append(c);
                }
            } else {
                if (i % 2 != 0) {
                    ret.append(c);
                }
            }
        }
        return ret.length() == 0 ? "EMPTY" : ret.toString();
    }
}
