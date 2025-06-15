package array;
/*
 * max lengthWise
 */
public class StringArray {

	public static void main(String[] args) {
		String str[]={"apple","mango","banana","water"};
		String max=str[0];
		
		for(int i=1; i<str.length; i++) 
		{
			if(max.length()<str[i].length()) 
			{
				max=str[i];
			}
		}
		System.out.println(max);

	}

}
