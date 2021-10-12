package string;

public class CharacterCount {
	public static void main(String[] args) {
		String str = "The best of both worlds";
		String s = str.replaceAll(" ","");
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			count++;
		}
		System.out.println("Total character in String : "+count);
	}

}
