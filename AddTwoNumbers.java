public class AddTwoNumbers {
    public static void main(String[] args) {
        // Check if at least two arguments are provided
        if (args.length < 2) {
            System.out.println("Please provide two numbers as arguments.");
            return;
        }

        // Parse the input arguments to integers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Calculate the sum
        int sum = num1 + num2;

        // Print the result
        System.out.println("The sum is " + sum);
    }
}
