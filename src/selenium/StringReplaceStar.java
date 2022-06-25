package selenium;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

public class StringReplaceStar {

	@Test
	public static void stringstar() {
		String s = "tusharmittal610@gmail.com";
		String[] k = s.split("@");
		System.out.println(Arrays.toString(k));

		System.out.println(k[0].length() - 5);

		String l = k[0].substring(k[0].length() - 5);
		System.out.println(l);

		 String S1= k[0].replace(l, "*****");
		 System.out.println(S1+k[1]);
		 
		 ArrayList<String> ar= new ArrayList<String>();
		 ar.add("simil88mittal@gmail.com");
		 ar.add("tusharmittal610@gmail.com");
		 ar.add("aryagupta@gmail.com");
		 ar.add("sonamansoori@gmail.com");
		 
		 for(int i=0; i<ar.size(); i++) {
			 //stringstar(s);
			 System.out.println(ar.get(i));
		 }
		 		



	}

}
