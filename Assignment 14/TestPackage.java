import mathop.MathsOperations;
import statop.StatsOperations;

public class TestPackage {
    public static void main(String[] args) {
        double[] numbers = {10, 5, 8, 20, 15};

        // Using mathop package
        double max = MathsOperations.findMaximum(numbers);
        double min = MathsOperations.findMinimum(numbers);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // Using statop package
        double avg = StatsOperations.findAverage(numbers);
        double median = StatsOperations.findMedian(numbers);
        System.out.println("Average: " + avg);
        System.out.println("Median: " + median);
    }
}