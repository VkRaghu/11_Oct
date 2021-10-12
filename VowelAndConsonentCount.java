package string;

public class VowelAndConsonentCount {
	public static void main(String[] args) {
		String str="This is a really simple sentence";
		String s = str.replaceAll(" ","");
		int vowel=0;
		int consonent=0;
		char []arr=s.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]=='a' ||arr[i]=='e' ||arr[i]=='i'|| arr[i]=='o' ||arr[i]=='u' )
			{
				vowel++;
			}
			else
			{
				consonent++;
			}
		}
		System.out.println("Total vowel : "+vowel);
		System.out.println("Total consonent : "+consonent);
	}

}
