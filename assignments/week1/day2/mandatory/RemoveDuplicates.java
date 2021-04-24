package week1.day2.assignments.mandatory;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		int count;
		String[] arr = text.split(" ");

		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < text.split(" ").length; j++) {
				if (arr[i].equals(arr[j])) {
					count++;
				}
			}
			if(count>1) {
				arr[i]="";
				System.out.print(arr[i]);
				continue;
			}
			System.out.print(arr[i] + " ");
		}
	}

}
