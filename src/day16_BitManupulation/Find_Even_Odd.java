package day16_BitManupulation;

public class Find_Even_Odd {

	public static void evenOrOddNum(int a)
	{
		if((a&1)!=0)//if first bit is set then odd number
		{
			System.out.println(" odd number ");
		}
		else 
			System.out.println(" even num ");
	}
	public static void main(String[] args) {
		evenOrOddNum(4);
	}
}
