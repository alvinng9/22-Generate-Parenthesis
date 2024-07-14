package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        helper(0, 0, n, "", result);
        return result;
    }

    public void helper(int left, int right, int n, String s, List<String> result) {
        if (s.length() == n * 2) {
            result.add(s);
            return;
        }

        if (left < n) {
            helper(left + 1, right, n, s + "(", result);
        }

        if (right < left) {
            helper(left, right + 1, n, s + ")", result);
        }
    }
}
