
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

	static char[] alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
	static char[] alphabetwSpesh = "!£$%^&*()-=_+[]{};'#:@~,./<>?abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
			.toCharArray();

	public static String pswrd(int input, boolean useSpecial) {
		String password = "";
		Random r = new Random();

		if (useSpecial){
			for (int i = 0; i < input; i++) {
				int randomNumber = r.nextInt(alphabetwSpesh.length);
				password += alphabetwSpesh[randomNumber];
			}
		} else {
			for (int i = 0; i < input; i++) {
				int randomNumber = r.nextInt(alphabet.length);
				password += alphabet[randomNumber];
			}
		}
		return password;
	}

	public static void init() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of your password: ");
		int input = s.nextInt();
		s.nextLine();

		System.out.println("Would you like special characters or not? Y/N");

		boolean useSpecial = s.nextLine().toLowerCase().equals("y") ? true  : false;
		System.out.println(pswrd(input, useSpecial));
	}

	public static void main(String args[]) {
		init();
	}
}
