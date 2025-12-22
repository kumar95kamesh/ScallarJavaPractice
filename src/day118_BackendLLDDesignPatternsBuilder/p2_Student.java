package day118_BackendLLDDesignPatternsBuilder;

/**
 * This is same as p1 all classes its we are using inner class here.
 */
public class p2_Student {
    int age;
    String name;
    String batch;
    int gradyear;
    String course;

    private p2_Student(StudentBuilder builder){//private so we can not call anywhere like Student.StudentBuilder

        if(builder.course!=null){
            this.course = builder.course;
        }else{
            this.course="Academy";
        }

        this.age = builder.age;
        this.name = builder.name;
        this.gradyear = builder.gradyear;
        this.batch = builder.batch;
    }

//    Student(AuthorName,BookName,ccc, , , )

    static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    public static class StudentBuilder {//it is mandatory to make static inner class.
        int age;
        String name;
        String batch;
        int gradyear;
        String course;

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public StudentBuilder setCourse(String course) {
            this.course = course;
            return this;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setGradyear(int gradyear) {
            this.gradyear = gradyear;
            return this;
        }

        public p2_Student build(){

            // validations
            if(this.age<10){
                throw new IllegalArgumentException("Age must be atleast 10");
            }

            if(this.gradyear>2024){
                throw new IllegalArgumentException("GradYear must smaller than 2024");
            }

            if(this.name==null){
                throw new IllegalArgumentException("Name can't be empty");
            }

            return new p2_Student(this);
        }
    }




}

// 10:21pm to 10:28pm;