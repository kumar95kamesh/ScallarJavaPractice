package patterns;

public class Pattern2_SquareWithDash {

	public static void main(String[] args) {
	//	Print 
	//	for n=3
	//	*-*
	//	*-*
	//	*-*
			//	for n=4
			//	*--*
			//	*--*
			//	*--*
			//	*--*
		int n=4;
		for(int i=0;i<n;i++)
		{
			System.out.print("*");
			for(int j=0;j<n-2;j++)
			System.out.print("-");// {} nhi h to loop will consider only 1 line
			System.out.println("*");//this will print and change the line
		}
				
	
	}

}
