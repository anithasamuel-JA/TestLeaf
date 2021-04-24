package week1.day2.assignments.mandatory;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "madam";
		String rev = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}

		if (name.equalsIgnoreCase(rev)) {
			System.out.println("palinDrome");

		}
	}

}
