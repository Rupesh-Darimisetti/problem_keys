package easy;

public class _19_MaximumPopulationYear {
    public static void main(String[] args) {
        int[][] logs = {{1993, 1999}, {2000, 2010}};
        int maxYear = maximumPopulation(logs);
        System.out.println(maxYear);
    }

    private static int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for (int[] log : logs) {
            int birth = log[0], death = log[1];
            birth = birth - 1950;
            death = death - 1950;
            for (int life = birth; life < death; life++) {
                arr[life] = arr[life] + 1;
            }
        }
        int max = 0, ans = 1950;
        for (int year = 0; year < arr.length; year++) {
            if (arr[year] > max) {
                max = arr[year];
                ans = year;
            }
        }
        return 1950 + ans;
    }
}
