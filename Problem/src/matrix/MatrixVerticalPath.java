package matrix;

import java.util.ArrayList;
import java.util.List;

public class MatrixVerticalPath {

	/**
	 * Given a matrix, this method will return all the possible path from the
	 * top to the bottom. From one row to the other, if you select the element
	 * in the row i and column j, you can choose the element in the row i+1 and
	 * column j-1, or the element in the row i+1 and column j or the element in
	 * the row i+1 and column j+1.
	 * 
	 * @param matrix - a matrix of int
	 * @return a list of string representing the path in the matrix
	 */
	public List<String> calculatePath(int[][] matrix) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < matrix[0].length; i++) {
			list.addAll(calculatePath(matrix, 1, i,	String.valueOf(matrix[0][i])));
		}
		return list;
	}

	private List<String> calculatePath(int[][] matrix, int rowElement,
			int columnElement, String s) {
		List<String> list = new ArrayList<String>();
		int max = 0;
		if (columnElement == matrix[rowElement].length - 1) {
			max = matrix[rowElement].length;
		} else {
			max = columnElement + 2;
		}

		for (int i = columnElement == 0 ? 0 : columnElement - 1; i < max; i++) {
			String tmp = s + matrix[rowElement][i];
			int re = rowElement + 1;
			if (rowElement < matrix.length - 1) {
				list.addAll(calculatePath(matrix, re, i, tmp));
			} else {
				list.add(tmp);
			}
		}
		return list;
	}
}
