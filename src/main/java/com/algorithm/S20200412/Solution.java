package com.algorithm.S20200412;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

    public int solution(int n, int[] lost, int[] reserve) {
        // Set으로 변경
        Set<Integer> lostSet = Arrays.stream(lost).boxed()
                .collect(Collectors.toSet());
        Set<Integer> reserveSet = Arrays.stream(reserve).boxed()
                .collect(Collectors.toSet());

        // 겹치는 영역 추출
        Set<Integer> intersectionSet = lostSet.stream()
                .filter(i -> reserveSet.contains(i))
                .collect(Collectors.toSet());

        // 겹치는 영역은 각 Set으로부터 삭제
        lostSet.removeAll(intersectionSet);
        reserveSet.removeAll(intersectionSet);

        // 빌린 수 계산
        int found = intersectionSet.size();

        // 남은 잃어버린 사람들을 정렬하여 배열로 변경
        int[] leftLosts = lostSet.stream()
                .mapToInt(i -> i)
                .sorted()
                .toArray();

        // 겹치는 부분 찾기
        for (int lostOne : leftLosts) {
            int front = lostOne - 1;
            if (reserveSet.contains(front)) {
                found++;
                reserveSet.remove(front);
                continue;
            }

            int back = lostOne + 1;
            if (reserveSet.contains(back)) {
                found++;
                reserveSet.remove(back);
            }
        }

        return n - lost.length + found;
    }
}
