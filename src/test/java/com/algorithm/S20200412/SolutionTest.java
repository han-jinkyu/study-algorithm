package com.algorithm.S20200412;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertSame;

public class SolutionTest {
    private Solution solution;

    @Before
    public void setup() {
        this.solution = new Solution();
    }

    @Test
    public void test1() {
        // given
        int n = 5;
        int[] lost = { 2, 4 };
        int[] reserve = { 1, 3, 5 };
        int expected = 5;

        // when
        int answer = solution.solution(n, lost, reserve);

        // then
        assertSame(expected, answer);
    }

    @Test
    public void test2() {
        // given
        int n = 5;
        int[] lost = { 2, 4 };
        int[] reserve = { 5 };
        int expected = 4;

        // when
        int answer = solution.solution(n, lost, reserve);

        // then
        assertSame(expected, answer);
    }

    @Test
    public void test3() {
        // given
        int n = 7;
        int[] lost = { 2, 3, 4 };
        int[] reserve = { 1, 2, 3, 6 };
        int expected = 6;

        // when
        int answer = solution.solution(n, lost, reserve);

        // then
        assertSame(expected, answer);
    }

    @Test
    public void test4() {
        // given
        int n = 6;
        int[] lost = { 2, 3, 4, 5 };
        int[] reserve = { 1, 4 };
        int expected = 4;

        // when
        int answer = solution.solution(n, lost, reserve);

        // then
        assertSame(expected, answer);
    }

    @Test
    public void test5() {
        // given
        int n = 6;
        int[] lost = { 1, 3, 4, 5 };
        int[] reserve = { 1, 4 };
        int expected = 4;

        // when
        int answer = solution.solution(n, lost, reserve);

        // then
        assertSame(expected, answer);
    }

    @Test
    public void test6() {
        // given
        int n = 5;
        int[] lost = { 2, 3, 4 };
        int[] reserve = { 3, 4, 5 };
        int expected = 4;

        // when
        int answer = solution.solution(n, lost, reserve);

        // then
        assertSame(expected, answer);
    }

    @Test
    public void test7() {
        // given
        int n = 5;
        int[] lost = { 2, 4 };
        int[] reserve = { 5 };
        int expected = 4;

        // when
        int answer = solution.solution(n, lost, reserve);

        // then
        assertSame(expected, answer);
    }
}
