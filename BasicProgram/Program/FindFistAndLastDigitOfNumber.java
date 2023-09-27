package Program;

public class FindFistAndLastDigitOfNumber {
// 1st and last digit of number 1 and 4
	public static void main(String[] args) {
		// Approach 2
		int num=1234;
		int[] array = new int[4];//4321
		int count = -1; 

		while (num != 0) {
			int rev = num % 10; // 4
			count++;// 0
			array[count] = rev;// 456...7
			num = num / 10;
		}
		System.out.println(count);
		System.out.println(array.length-1);
		System.out.println(array[0]);
		
		
		
		
		

	}
	public static int m1(int i) {// pa
		String str=	Integer.toString(i);
		
		System.out.println(str);
		System.out.println(str.charAt(0));
		//System.out.println(str.length());//4
		System.out.println(str.charAt(str.length()-1));
		return i;
	}
	


}
