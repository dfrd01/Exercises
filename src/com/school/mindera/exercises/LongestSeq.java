package com.school.mindera.exercises;

public class LongestSeq {
    public static void main(String[] args) {
        int[] sequence = new int[]{1, 2, 2, 2, 2, 0, 3, 3, 1, 1, 1, 1, 1, 4};
        System.out.println(longestSequence(sequence));

        int[] sequence2 = new int[]{5, 7, 5, 3, 3, 3, 0};
        System.out.println(longestSequence(sequence2));

        int[] sequence3 = new int[]{1, 10, 10, 2};
        System.out.println(longestSequence(sequence3));

        int[] sequence4 = new int[]{1, 10, 10, 2, 2};
        System.out.println(longestSequence(sequence4));
    }

    public static int longestSequence(int[] numbers) {
        int position = 0;
        int temp = 0;
        for (int i = 1; i < numbers.length - 1; i++) {
            temp = numbers[i];
            if (numbers[i + 1] != temp) {
                temp = numbers[i + 1];
            } else {
                position += 1;
                temp = numbers[i + 1];
            }
        }
        return position;
    }
}

