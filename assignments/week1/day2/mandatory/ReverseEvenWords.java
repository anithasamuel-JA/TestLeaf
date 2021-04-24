package week1.day2.assignments.mandatory;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] test = "I am a software tester".split(" ");
		String output = "";
		String rev = "";

		for (int i = 0; i < test.length; i++) {
			String word = test[i];
			if (i % 2 != 0) {
				for (int j = word.length() - 1; j >= 0; j--) {
					rev = rev + word.charAt(j);
				}
				output = output + rev + " ";
				rev = "";
			} else {
				output = output + test[i] + " ";
			}
		}
		System.out.println(output);
	}
}
