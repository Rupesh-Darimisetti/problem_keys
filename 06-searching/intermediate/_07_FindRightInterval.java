package intermediate;

import java.util.Arrays;

/**
 * You are given an array of intervals, where intervals[index] = [startIndex, endIndex] and each startIndex is unique.
 * The right interval for an interval index is an interval j such that startIndexJ >= endIndexJ and startIndexJ is
 * minimized. Note that index may equal j. Return an array of right interval indices for each interval index. If no
 * right interval exists for interval index, then put -1 at index of interval element.
 */
public class _07_FindRightInterval {
    public static void main(String[] args) {
        int[][] interval = {{1, 4}, {2, 3}, {3, 4}}; // Output: [-1,2,-1]
        int[] rightInterval = findRightInterval(interval);
        System.out.println(Arrays.toString(rightInterval));
    }

    private static int[] findRightInterval(int[][] intervals) {
        int[] answer = new int[intervals.length];
        int valueMax = Integer.MIN_VALUE;
        int valueMin = Integer.MAX_VALUE;

        for (int[] interval : intervals) {
            valueMax = Math.max(valueMax, interval[1]);
            valueMin = Math.min(valueMin, interval[0]);
        }
        int[] bucket = new int[valueMax - valueMin + 1];
        int val = -1;
        Arrays.fill(bucket, val);

        int index = 0;
        while (index < intervals.length) {
            bucket[intervals[index][0] - valueMin] = index;
            index++;
        }
        int bucketIndex = bucket.length - 2;
        while (bucketIndex >= 0) {
            if (bucket[bucketIndex] == val) {
                bucket[bucketIndex] = bucket[bucketIndex + 1];
            }
            bucketIndex--;
        }

        int answerIndex = 0;
        while (answerIndex < answer.length) {
            answer[answerIndex] = bucket[intervals[answerIndex][1] - valueMin];
            answerIndex++;
        }
        return answer;
    }
}

