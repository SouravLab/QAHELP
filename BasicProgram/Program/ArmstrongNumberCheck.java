package Program;

public class ArmstrongNumberCheck {

	// eclipse shortcut: ctrl+shift+t >> to search class name in entire workspace
	// remove space : ctrl+D
	// allignment : ctrl+A next ctrl+shift+f

	// 123 : 1*1*1+2*2*2+3*3*3= 123/1+8+27=36
	// 153: 1*1*1+5*5*5+3*3*3= 1+125+27= 153
	public static void main(String[] args) {
		int num = 153;
		int originalNumber = num;
		int temp;
		int rev = 0;
		while (num != 0) {// num>0
			temp = num % 10;// 3
			rev = rev + (temp * temp * temp);
			num = num / 10;
		}
		if (originalNumber == rev) {
			System.out.println("It is an ArmstrongNumber.... ");
		} else {
			System.out.println("It is not an ArmstrongNumber... ");
		}

	}

}
