public class fibber {

    /**
     * Calculates the nth term in the Fibonacci sequence recursively.
     * The Fibonacci sequence is characterized by the fact that every number
     * after the first two is the sum of the two preceding ones.
     *
     * @param n The position in the Fibonacci sequence.
     *          The first position in the sequence is 0.
     * @return The nth term of the Fibonacci sequence.
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /**
     * Main method to execute the program.
     * This method calls the fibonacci method with n = 10 and prints the result.
     */
    public static void main(String[] args) {
        int n = 10;
        int nthFibonacci = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + nthFibonacci + ".");
    }
}
