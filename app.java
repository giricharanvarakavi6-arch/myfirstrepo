public class ControlFlowExample {
    public static void main(String[] args) {
        int maxNumber = 5;
        int sum = 0;

        // For loop executing 5 times
        for (int i = 1; i <= maxNumber; i++) {
            sum += i;
        }

        System.out.println("The sum of numbers from 1 to " + maxNumber + " is: " + sum);

        // If-Else condition
        if (sum % 2 == 0) {
            System.out.println("The sum is an even number.");
        } else {
            System.out.println("The sum is an odd number.");
        }
    }
}

