import java.util.LinkedList;
import java.util.List;

public class GreyCode {
	public static final String ZERO = "0";
	public static final String ONE = "1";

	/**
	 * Given a number n, the method return a list of n-bit string ordered by the
	 * reflected binary code. This method will find the solution using the
	 * recursion.
	 * 
	 * @param n - n-bit
	 * @return - list of string
	 */
	public List<String> calculateCodeRecursively(int n) {
		List<String> l;
		if (n == 1) {
			l = new LinkedList<String>();
			l.add(ZERO);
			l.add(ONE);
		} else {
			l = calculateCodeRecursively(--n);
			LinkedList<String> lTemp = new LinkedList<String>();
			for (int i = l.size() - 1; i >= 0; i--) {
				lTemp.addFirst(ZERO + l.get(i));
				lTemp.addLast(ONE + l.get(i));
			}
			l = lTemp;
		}
		return l;
	}

	/**
	 * Given a number n, the method return a list of n-bit string ordered by the
	 * reflected binary code. This method will find the solution iteratively.
	 * 
	 * @param n - n-bit
	 * @return - list of string
	 */
	public List<String> calculateCodeIteratively(int n) {
		List<String> l = new LinkedList<String>();
		int sizeList = (int) Math.pow(2, n);
		for (int i = 0; i < sizeList; i++) {
			StringBuilder sb = new StringBuilder();
			if (i < (sizeList / 2)) {
				sb.append(ZERO);
			} else {
				sb.append(ONE);
			}

			for (int j = 1, k = n - j; j < n; j++, k--) {
				int powJ = (int) Math.pow(2, j - 1);
				int powK = (int) Math.pow(2, k - 1);
				if (i % (sizeList / powJ) >= powK
						&& i % (sizeList / powJ) < (sizeList / powJ) - powK) {
					sb.append(ONE);
				} else {
					sb.append(ZERO);
				}
			}

			l.add(sb.toString());
		}
		return l;
	}

}
