package day110_BackendLLdJavaAdvanceConceptsCollection;

import java.util.Comparator;

public class Student implements Comparable<Student>{//comparable is generic type so Student passed on which data type we have to work on.
    int age;
    double psp;
    String name;
    double attendance;

    Student(int age, double psp, String name , double attendance) {
        this.age = age;
        this.psp = psp;
        this.name = name;
        this.attendance = attendance;
    }
    
    
    /**
     * println method has this toString method.. and toString in present in Object class
     * so we can modify this println mtd also.. after overriding this mtd.. whatever we print
     * it will print Rishabh everytime. 
     */
//    @Override
//    public String toString() {
//		return "Rishabh";
//    	
//    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + this.age +
                ", psp=" + this.psp +
                ", name='" + this.name + '\'' +
                ", attendance=" + this.attendance +
                '}';
    }

//For sorting we use sort mtd.. which uses compareTo mtd.. so for student class we can
//  Write our own compareTo mtd... so here we have written this mtd for age.
//  So 
//    Whenever this object should come first will return -1, other will return 1
//    @Override
//    public int compareTo(Student o) {
//        if(this.age>o.age){
//            return -1;
//        }else if(o.age>this.age){
//            return 1;
//        }else{
//            return 0;
//        }
//    }

    /**
     * This is smarter way of writting upper mtd.
     * o-->other
     * this.age. mine age.
     */
    @Override
    public int compareTo(Student o) {
        return o.age-this.age;//o.age>this.age.. this will return +ve... simillar 0, negative cases.
    }

}
