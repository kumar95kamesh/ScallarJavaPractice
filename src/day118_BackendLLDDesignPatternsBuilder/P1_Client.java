package day118_BackendLLDDesignPatternsBuilder;

public class P1_Client {
    public static void main(String[] args) {
//        Student st = new Student();

//        StudentBuilder sb = new StudentBuilder();
//
//        sb.setAge(25);
//        sb.setGradyear(2025);
//        sb.setBatch("Jan 2025");
    	//like this we don't need to call particular key.. we are directly setting it.. so no need to
    	//remember any sequence..  koi bhi galat set nhi ho skta.
//
//        Student st = new Student(sb);//according to validations if this student object doesn;t set properly
    									// it will throw exp. and won't run.

    	//builder return method static so can be called with class name.. so whatever builder that mtd was
    	//returning.. we can set those properties with this method.
//        StudentBuilder sb = Student.getBuilder();
//
//        sb.setAge(25);		//if we do not return anything in student builder set functions then this can be done.
//        sb.setGradyear(2025);
//        sb.setBatch("Jan 2025");
//
//        Student st = new Student(sb);


    	//Like Streams intermediate functions they return stream back.. so we can call another method again.
    	//e.g. findele().gettext().trim(); to jb tk intermediate call honge wo same hi cheej retrun krte rhte h..
    	//like streams we have returned studentBuilder in its setters again.. return this.
//        StudentBuilder sb = Student.getBuilder()
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

        P1_Student st = P1_Student.getBuilder()
                .setAge(25)
                .setGradyear(2025)
                .setBatch("Jan 2025")
                .build();


    }
}