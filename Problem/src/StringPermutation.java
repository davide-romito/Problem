import java.util.HashSet;
import java.util.Set;

public class StringPermutation {

	/**
	 * Given a String str, this method calculate the permutation of this string
	 * 
	 * @param str
	 * @return a set of string
	 */
	public Set<String> calculatePermutations(String str) {
		Set<String> set = new HashSet<String>();
		char[] cArr = str.toCharArray();
		for (int i = 0; i < cArr.length; i++) {
			set.add(String.valueOf(cArr[i]));
		}
		return calc(set, cArr, 1);
	}

	private Set<String> calc(Set<String> set, char[] cArr, int index) {
		if (index == cArr.length) {
			return set;
		} else {
			Set<String> tmpSet = new HashSet<String>();
			for (String s : set) {
				for (int i = 0; i < cArr.length; i++) {
					if (!s.contains(String.valueOf(cArr[i]))) {
						tmpSet.add(s + cArr[i]);
					}
				}
			}
			return calc(tmpSet, cArr, ++index);
		}
	}
}
