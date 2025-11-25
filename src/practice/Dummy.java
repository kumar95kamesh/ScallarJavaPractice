package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dummy {
	public static void main(String[] args) {
		Map<Integer, Country> abc=new HashMap<Integer, Country>();
		Country c=new Country();
		c.setA(2);
		c.setB("abc");
		abc.put(1,c);
		
		System.out.println(abc.get(1).getA());
	}

	
	

 
	
}
