package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void generateParenthesisTest() {
        Solution solution = new Solution();
        List<String> input = Arrays.asList("((()))","(()())","(())()","()(())","()()()");
        assertEquals(input, solution.generateParenthesis(3));
        input = Arrays.asList("()");
        assertEquals(input, solution.generateParenthesis(1));
        input = Arrays.asList("(())","()()");
        assertEquals(input, solution.generateParenthesis(2));
        input = Arrays.asList("(((())))","((()()))","((())())","((()))()","(()(()))","(()()())",
                "(()())()","(())(())","(())()()","()((()))",
                "()(()())","()(())()","()()(())","()()()()");
        assertEquals(input, solution.generateParenthesis(4));
        input = Arrays.asList("((((()))))","(((()())))","(((())()))","(((()))())","(((())))()",
                "((()(())))","((()()()))","((()())())","((()()))()","((())(()))",
                "((())()())","((())())()","((()))(())","((()))()()","(()((())))",
                "(()(()()))","(()(())())","(()(()))()","(()()(()))","(()()()())",
                "(()()())()","(()())(())","(()())()()","(())((()))","(())(()())",
                "(())(())()","(())()(())","(())()()()","()(((())))","()((()()))",
                "()((())())","()((()))()","()(()(()))","()(()()())","()(()())()",
                "()(())(())","()(())()()","()()((()))","()()(()())","()()(())()",
                "()()()(())","()()()()()");
        assertEquals(input, solution.generateParenthesis(5));


    }

}