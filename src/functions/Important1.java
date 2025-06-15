package functions;

public class Important1 {

	public static void main(String[] args) {
//		You are given a positive integer A denoting the radius of a circle. 
//		You have to calculate the area of the circle. And return the ans up to 2 decimals
		System.out.println(circleArea(8));;
	}
	public static double circleArea(int r)
	{
		double PI=3.1416;
		double area=PI*r*r;//this will give ans more then 2 decimals
		return Math.round(area*100.0)/100.0;
	//Math.ceil(area);// This method will round off area..nearest to decimal value
			//100 me 2 decimals 1000 me 3 decimals...
			//baad wale 0 sirf decimals me convert krega...
			//kuki y round wala mtd shyad long me values deta h
	}

}
