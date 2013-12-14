/**
 * Fibonacci sequence are the numbers in the following integer sequence: 
 * 0 1 1 2 3 5 8 13 21 34 55 89 144
 * 
 * The sequence F(n) of Fibonacci numbers is defined by the recurrence relation:
 * F(n) = F(n-1) + F(n-2)
 * with 
 * F(0) = 0  and F(1) = 1.
 * 
 * @author Davide Romito
 * 
 */

public class Fibonacci {

	/**
	 * This method will return the n-th number in the Fibonacci Sequence. The
	 * number is calculate recursively.
	 * 
	 * @param n - index of the number
	 * @return the number corresponding on the n-th number of Fibonacci Sequence
	 */
	public int fibonacciNumberRecursive(int n) {
		if (n == 1 || n == 0) {
			return n;
		}
		return fibonacciNumberRecursive(n - 1)
				+ fibonacciNumberRecursive(n - 2);
	}

	/**
	 * This method will return the n-th number in the Fibonacci Sequence. The
	 * number is calculate iteratively.
	 * 
	 * @param n - index of the number
	 * @return the number corresponding on the n-th number of Fibonacci Sequence
	 */
	public int fibonacciNumberIterative(int n) {
		int n0 = 0;
		int n1 = 1;

		for (int i = 2; i <= n; i++) {
			int tmp = n1 + n0;
			n0 = n1;
			n1 = tmp;
		}
		return n1;
	}

}
