package day110_BackendLLdJavaAdvanceConceptsCollection;

import java.util.Comparator;

public class StudentPSPComparator implements Comparator<Student>{
	 @Override
	    public int compare(Student o1, Student o2) {
	        return (int)(o1.psp-o2.psp);
	    } 
	 
	 /**
	  * If any interface has only one functional mtd(single impelemented mtd) called as functional interface.. e.g.comparator
	  */
	 
	 /**
	  * Comparator<Student> means java will know that we have written a mtd to compare 
	  * for student.
	  */

	 /**
	  * To make our own comparision mtd this is another way 
	  * first is written in Student class with comparable interface.
	  * second one is create anoter class with compare mtd separately.
	  * comparable works with in class.. and 
	  * comparator works outside the class.
	  * 
	  * so based on requirement we can use any of the mtd.. if we use inside class then
	  * it will compare based on that criteria..
	  * but suppose if someone wants to compare on different criteria.. he can not do that
	  * in same class.. so another class can be created and we can compare based on different
	  * criterias
	  */
}
