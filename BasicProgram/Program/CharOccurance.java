package Program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CharOccurance {
	public static void main(String[] args) {
		String name = "Today is my interview with CBA";
		char[] ch = name.toCharArray();
		Map<Character, Integer> bmap = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (bmap.containsKey(c)) {
				bmap.put(c, bmap.get(c) + 1);
			} else {
				bmap.put(c, 1);
			}
		}

		for (Entry<Character, Integer> entry : bmap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}
}
