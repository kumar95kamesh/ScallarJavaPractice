package day119_BackendLLDDesignPatternsPrototypeandRegistry;

public class Student implements Prototype<Student>{
    private int id;
    String name;
    String batch;

    Student(){

    }

    Student(Student st) {//copy constructor
        this.id = st.id;
        this.name = st.name;
        this.batch = st.batch;
    }

    @Override
    public Student copy() {
        Student st = new Student(this);//copy constructor hi to h.. bs abstraction k liye
        								//uper ka constructor hi call kr diya
        return st;
    }
    
    
    /**
     *  uper wala ese bhi likh skte the.. wo to bs abstruction ka use kiya
     */
//    @Override
//    public Student copy() {
//    	Student st = new Student();
//        st.id = this.id;
//        st.name = this.name;
//        st.batch = this.batch;			
//        return st;
//    }
}