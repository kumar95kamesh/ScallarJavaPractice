package stringAndNoOfOccurences;

import java.util.LinkedHashSet;

public class uniqueWord {

	public static void main(String[] args) {	
		String s="jaipur is is a good good city";
		String str[]=s.split(" ");
	 LinkedHashSet<String> set = new LinkedHashSet<String>();
	 
	 for(int i=0; i<str.length; i++) {
		 set.add(str[i]);
	 }
	
	 
	 for(String st:set) {
		 int count=0;
	 for(int i=0; i<str.length; i++) {
		if(st.equals(str[i])) {
			count++;
		}
	 }
	 if(count==1)// unique word
	 System.out.println(st);
	 
	 //if(count>1)// repeated word word
		// System.out.println(ch);

}


	}

}
