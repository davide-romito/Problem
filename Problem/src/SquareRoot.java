public class SquareRoot {

	private int seed;
	private int n;

	/**
	 * This method calculate the initial seed value for calculate the square
	 * root with the babylonian method
	 * 
	 * http://en.wikipedia.org/wiki/Methods_of_computing_square_roots#
	 * Rough_estimation
	 * 
	 * @param number
	 */
	public void roughEstimation(int number) {
		int i = 0;
		double tmp;
		do {
			tmp = number / Math.pow(10, 2 * i);
			if (tmp >= 1 && tmp < 100) {
				if (tmp < 10) {
					this.seed = 2;
				} else {
					this.seed = 6;
				}
				this.n = i;
			}
			i++;
		} while (tmp >= 100);
	}

	/**
	 * This method calculate the square root using the babylonian method
	 * 
	 * http://en.wikipedia.org/wiki/Methods_of_computing_square_roots#
	 * Babylonian_method
	 * 
	 * @param number
	 * @return - the square root of the number
	 */
	public double babylonianMethod(int number) {
		double xi = this.seed * Math.pow(10, this.n);
		double xj = Double.MIN_VALUE;
		while (xj != xi) {
			xj = xi;
			xi = (xi + (number / xi)) / 2;
		}
		return xi;
	}
}
