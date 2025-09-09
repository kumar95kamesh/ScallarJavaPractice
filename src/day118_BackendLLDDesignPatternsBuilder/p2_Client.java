package day118_BackendLLDDesignPatternsBuilder;

public class p2_Client {
    public static void main(String[] args) {
//        Student st = new Student();

//        StudentBuilder sb = new StudentBuilder();
//
//        sb.setAge(25);
//        sb.setGradyear(2025);
//        sb.setBatch("Jan 2025");
//
//        Student st = new Student(sb);


//        StudentBuilder sb = Student.getBuilder();
//
//        sb.setAge(25);
//        sb.setGradyear(2025);
//        sb.setBatch("Jan 2025");
//
//        Student st = new Student(sb);


//        Student.StudentBuilder sb = Student.getBuilder()
//                .setAge(25)
//                .setGradyear(2025)
//                .setBatch("Jan 2025");
//
//        Student st = new Student(sb);


//        Student st = Student.getBuilder()
//                .setAge(25)
//                .setGradyear(2025)
//                .setBatch("Jan 2025")
//                .build();

        p2_Student st = p2_Student.getBuilder()
                .setAge(25)
                .setGradyear(2025)
                .setBatch("Jan 2025")
                .build();


/**
 * if we do not make student constructor private then we can set the things like this.. and all the 
 * validations are in build(); so all the validations can be bypassed like this.. jb mtd hi call nhi hoga 
 * to validations kaise apply honge.. so we want you to get the builder from there and force to use build()
 * for validations.
 */
//                Student.StudentBuilder sb = Student.getBuilder()
//                .setAge(25)
//                .setGradyear(2025)
//                .setBatch("Jan 2025");
//
//        Student st = new Student(sb);



    }
}