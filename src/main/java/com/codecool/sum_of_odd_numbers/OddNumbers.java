package com.codecool.sum_of_odd_numbers;

import java.util.List;

public class OddNumbers {

    public static Integer sum(List<Integer> numbers) {
            return numbers.stream()
                    .mapToInt(Integer::intValue)
                    .filter(n -> (n % 2 != 0))
                    .sum();
        }
    }








