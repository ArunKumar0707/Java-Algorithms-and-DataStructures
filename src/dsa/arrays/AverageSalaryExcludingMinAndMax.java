package dsa.arrays;

public class AverageSalaryExcludingMinAndMax {

    public static double average(int[] salary) {
        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int s : salary) {
            min = Math.min(min, s);
            max = Math.max(max, s);
            total += s;
        }
        return (double) (total - min - max) / (salary.length - 2);
    }

    public static void main(String[] args) {
        int[] salary1 = {4000, 3000, 1000, 2000};
        System.out.println(average(salary1));

        int[] salary2 = {1000, 2000, 3000};
        System.out.println(average(salary2));
    }
}

