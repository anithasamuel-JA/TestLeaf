package week1.day2.assignments.mandatory;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] ch = new char[test.length()];

		for (int i = 0; i < test.length() - 1; i++) {
			ch[i] = test.charAt(i);
		}

		for (int i = 0; i < test.length() - 1; i++) {
			if (i % 2 != 0) {
				ch[i] = Character.toUpperCase(ch[i]);
			}
			System.out.print(ch[i]);
		}
	}

}
