package string;

public class PanctuationCount {
	public static void main(String[] args) {
		String str = "He said, 'The mailman loves you.' I heard it with my own ears.";
		String s = str.replaceAll(" ","");
		char []arr = s.toCharArray();
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(Character.isAlphabetic(arr[i])) {
				continue;
			}
			else {
				count++;
			}
		}
		System.out.println("Total panctuations in this string : "+count);
	}

}
