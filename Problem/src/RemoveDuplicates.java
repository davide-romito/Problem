/**
 * 
 * @author Davide Romito
 *
 */
public class RemoveDuplicates {

	/**
	 * Given a string this method return a string without consecutive character duplicated
	 * @param s - input string
	 * @return a string without duplicate
	 */
	public String removeDuplicateCharIteratively(String s) {
		char[] cArr = s.toCharArray();
		StringBuilder sb = new StringBuilder(String.valueOf(cArr[0]));
		for (int i = 1; i < cArr.length; i++) {
			if (cArr[i] != cArr[i - 1]) {
				sb.append(cArr[i]);
			}
		}
		return sb.toString();
	}

	/**
	 * Given a string this method return a string without consecutive character duplicated
	 * @param s - input string
	 * @param index - index of the starting character. 0 for consider the whole string s
	 * @return a string without duplicate
	 */
	public String removeDuplicateCharRecursively(String s, int index) {
		if (s.length() < 2) {
			return s;
		}
		char[] cArr = s.toCharArray();
		if (index == s.length() - 2) {
			return (cArr[cArr.length - 1] != cArr[cArr.length - 2] ? s : s.substring(0, s.length() - 1));
		} else {
			if (cArr[index] != cArr[index + 1]) {
				return removeDuplicateCharRecursively(s, ++index);
			} else {
				return removeDuplicateCharRecursively(s.substring(0, index) + s.substring(index + 1), index);
			}
		}
	}

}
