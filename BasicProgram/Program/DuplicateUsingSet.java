package Program;

import java.util.HashSet;
import java.util.Set;

public class DuplicateUsingSet {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10, 10 };
		Set<Integer> set = new HashSet();
		for (int i : arr) {
			// System.out.println(set.add(i));
			if (!set.add(i)) {
				System.out.println(i);
			}
		}

	}

}
