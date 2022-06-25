package selenium;

import org.testng.annotations.Test;

public class CountLetterString {
	
	@Test
	public void count_letter() {
		String s= "Tu hi mera bhai hai";
		char ch= 'h';
		int count=0;
		
		for(int i=0; i< s.length(); i++) {
			if(s.charAt(i)== ch)
				count++;
				
		}
		System.out.println("The count of ch in given String is: " +count);
	}

}
