package programmers.challenge.level0;

import java.util.HashMap;
import java.util.Map;

/**
 * 문제제목: 로그인 성공?
 * 작 성 일: 2024.10.19
 * 작 성 자: YUN YOUNG
 * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/120883
 */
public class Login {
    public static void main(String[] args) {
        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {
                {"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}
        };
        System.out.println(solution(id_pw, db));
    }

    private static String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String password = id_pw[1];

        Map<String, String> dbMap = new HashMap<>();

        for (int i = 0; i < db.length; i++) {
            dbMap.put(db[i][0], db[i][1]);
        }

        if (dbMap.containsKey(id)) {
            return dbMap.get(id).equals(password) ? "login" : "wrong pw";
        }
        return "fail";
    }
}
