package day6_LLD_oop4_interfacesAbstractClasses;

public class Main {

	public static void main(String[] args) {
		Interface1.mtd1();//in Interface and class visibility is different but we can call them..
		Class1.mtd1();    //because it bounds to that class or interface.. not to instance.

	}

}
