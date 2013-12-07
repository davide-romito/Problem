import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AmericanPhoneNumber {
	public static Map<Character, String[]> map;

	static {
		map = new HashMap<Character, String[]>();
		map.put('0', new String[] { " " });
		map.put('1', new String[] { "." });
		map.put('2', new String[] { "a", "b", "c" });
		map.put('3', new String[] { "d", "e", "f" });
		map.put('4', new String[] { "g", "h", "i" });
		map.put('5', new String[] { "j", "k", "l" });
		map.put('6', new String[] { "m", "n", "o" });
		map.put('7', new String[] { "p", "q", "r", "s" });
		map.put('8', new String[] { "t", "u", "v" });
		map.put('9', new String[] { "w", "x", "y", "z" });
	}

	/**
	 * Given a phone number, this method will return all the combination of the
	 * word you can compose with that number
	 * 
	 * @param number
	 * @return - a list of all possible word
	 */
	public List<String> componeWords(String number) {
		return componeWords(number, null);
	}

	private List<String> componeWords(String number, List<String> list) {
		if (list == null) {
			list = new ArrayList<String>(Arrays.asList(map.get(number.charAt(0))));
		} else {
			List<String> tmpList = new ArrayList<String>();
			for (String s1 : list) {
				for (String s2 : map.get(number.charAt(0))) {
					tmpList.add(s1 + s2);
				}
			}
			list = tmpList;
		}
		return number.length() > 1 ? componeWords(number.substring(1), list) : list;

	}

}
