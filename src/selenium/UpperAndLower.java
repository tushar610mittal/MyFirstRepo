package selenium;

import org.testng.annotations.Test;

public class UpperAndLower {

	@Test
	public void stringupperlower() {
		String s = "Only Money Matters";
		String[] s1 = s.split(" ");
		String s3 = "";

		for (int i = 0; i < s1.length; i++) {
			String s2 = s1[i];
			for (int j = 0; j < s2.length(); j++) {
				char c= s2.charAt(j);
				if (Character.isUpperCase(c)) 
					s2.replace(c,Character.toLowerCase(c));
				
				//s3 = s3 + s2;

			}

			System.out.println(s2);

		}
	}
}
