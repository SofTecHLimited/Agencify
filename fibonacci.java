import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = getValidInput(scanner);

        System.out.println("Fibonacci sequence up to " + n + ":");
        generateFibonacciSequence(n);
    }

    private static int getValidInput(Scanner scanner) {      // This method Validates user input for correct values
        int n;
        while (true) {
            try {
                n = Integer.parseInt(scanner.nextLine());
                if (n <= 0) {
                    throw new IllegalArgumentException("You Entered 0 or a negative integer, Please enter a positive integer.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a positive integer: ");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.print("Enter a positive integer: ");
            }
        }
        return n;
    }

    private static void generateFibonacciSequence(int n) { // Generate and print the fibonacci sequence up to the specified number
        int first = 0;
        int second = 1;

        System.out.print(first + " ");

        if (n > 1) {
            System.out.print(second + " ");

            for (int i = 2; i < n; i++) {
                int next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
        }

        System.out.println();
    }
}
