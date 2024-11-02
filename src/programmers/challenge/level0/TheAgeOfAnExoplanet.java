package programmers.challenge.level0;

public class TheAgeOfAnExoplanet {
    public static void main(String[] args) {
        // Test Case
        int age = 23;
        System.out.println(solution(age));
    }

    private static String solution(int age) {

        char[] charArray = String.valueOf(age).toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            charArray[i] += 49;
        }

        return String.valueOf(charArray);
    }
}
