import java.util.List;

public class LargestDifference {
    public static int findLargestDifference(List<Integer> numbers) {
        if (numbers.size() < 2) {
            return 0;
        }

        int minNumber = numbers.get(0);
        int maxDifference = 0;

        for (int i = 1; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            maxDifference = Math.max(maxDifference, currentNumber - minNumber);
            minNumber = Math.min(minNumber, currentNumber);
        }

        return maxDifference;
    }
 
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 9, 3, 7);
        int largestDifference = findLargestDifference(numbers);
        System.out.println("The largest difference is: " + largestDifference);
    }
}
//This program calculates the lagest difference from a list of numbers and prints it