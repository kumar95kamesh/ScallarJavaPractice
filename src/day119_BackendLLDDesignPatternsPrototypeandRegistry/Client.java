package day119_BackendLLDDesignPatternsPrototypeandRegistry;

public class Client {

    static void doSomething(Student s){
//        Student st2 = new Student(s);
        Student st2 = s.copy();
    }


    public static void fillRegistry(StudentRegistry studentRegistry){
        Student st = new Student();
        st.batch = "Test";
        st.name = "ScalerStudent";
        studentRegistry.register("Student",st);

        IntelligentStudent is =  new IntelligentStudent();
        studentRegistry.register("IntelligentStudent",is);
    }

    public static void main(String[] args) {
//        Student st = new Student();
//        st.batch = "Test";
//        st.name = "ScalerStudent";
//
////        doSomething(st);//st will be student type copy
//
//        IntelligentStudent ist = new IntelligentStudent();
//        doSomething(ist);ist will be student type copy

        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student ist = (Student)studentRegistry.get("Student");
    }
}