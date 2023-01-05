package org.rupesh.easy;

public class _23_AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public static void main(String[] args) {
        int[] salary = {4000, 3000, 1000, 2000}; // output: 2500.00
        double res = average(salary);
        System.out.println(res);
    }

    public static double average(int[] salary) {
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        int sum = 0;
        int len = salary.length;
        for (int num : salary) {
            if (num > large) { // it stores large number
                large = num;
            }
            if (num < small) {// it stores small number
                small = num;
            }
            sum += num;
        }
        return (sum - small - large) / ((len - 2) * 1.0);
    }
}
