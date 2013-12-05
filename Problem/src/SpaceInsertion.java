import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SpaceInsertion {

	private List<String> sortedDictionary;
	private Integer minLength;
	private Integer maxLength;

	public SpaceInsertion(String[] dictionary) {
		sortedDictionary = new LinkedList<String>(Arrays.asList(dictionary));
		minLength = Integer.MAX_VALUE;
		maxLength = Integer.MIN_VALUE;
		checkLength(dictionary);
	}

	private void checkLength(String[] arr) {
		for (String s : arr) {
			if (minLength > s.length()) {
				minLength = s.length();
			}
			if (maxLength < s.length()) {
				maxLength = s.length();
			}
		}
	}

	public String insertSpace(String stringToInsertSpace) {
		for (int i = minLength; i <= maxLength; i++) {
			String sub = stringToInsertSpace.substring(0, i);
			if (sortedDictionary.contains(sub)) {
				String retStr = null;
				if ((stringToInsertSpace.length() > i && (retStr = insertSpace(stringToInsertSpace
						.substring(i))) != null)
						|| stringToInsertSpace.length() == i) {
					return stringToInsertSpace.length() == i ? sub : sub + " " + retStr;
				}
			}
		}
		return null;
	}

}
