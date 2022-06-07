
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

	static char[] alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
	static char[] alphabetwSpesh = "!£$%^&*()-=_+[]{};'#:@~,./<>?abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
			.toCharArray();

	public static String pswrd(int input) {
		String password = "";
		Random r = new Random();

		for (int i = 0; i <= input; i++) {
			int randomNumber = r.nextInt(alphabet.length);
			password += alphabet[randomNumber];
		}
		return password;
	}

	public static String pswrdplus(int input) {
		String password = "";
		Random r = new Random();

		for (int i = 0; i <= input; i++) {
			int randomNumber = r.nextInt(alphabetwSpesh.length);
			password += alphabetwSpesh[randomNumber];
		}
		return password;
	}

	public static void init() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of your password: ");
		int input = s.nextInt();
		s.nextLine();

		System.out.println("Would you like special characters or not? Y/N");
		String test = s.nextLine().toLowerCase();

		if (test.equals("y")) {
			System.out.println(pswrdplus(input));
		} else if (test.equals("n")) {
			System.out.println(pswrd(input));
		} else {
			System.out.println("This is not an answer.");
		}
	}

	public static void main(String args[]) {
		init();
	}
}
