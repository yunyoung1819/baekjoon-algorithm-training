package programmers.algorithm.hash;

import java.util.HashSet;
import java.util.Set;

public class PhoneBook_Ref {
    public static void main(String[] args) {
        String[] phoneBook = {"123", "456", "789"};
        boolean result = solution(phoneBook);
        System.out.println(result);
    }

    private static boolean solution(String[] phoneBook) {
        Set<String> prefixes = new HashSet<>();

        for (String phone : phoneBook) {
            for (int end = 1; end < phone.length(); end++) {
                prefixes.add(phone.substring(0, end));
            }
        }

        for (String phone : phoneBook) {
            if (prefixes.contains(phone)) {
                return false;
            }
        }

        return true;
    }
}
