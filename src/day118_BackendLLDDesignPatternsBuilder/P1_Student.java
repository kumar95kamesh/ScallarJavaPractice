package day118_BackendLLDDesignPatternsBuilder;

/**
 * This session is very tricky video recording se hi better smjh aayega.. because all the validations were written here
 * like.. in constructor.
 *         if(builder.age<10){
            throw new IllegalArgumentException("Age must be atleast 10");
        }
 */

public class P1_Student {
    int age;
    String name;
    String batch;
    int gradyear;
    String course;

    P1_Student(P1_StudentBuilder builder){



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

    //for every class if we create new builder then we won't recognize like which class belongs to which builder..
    //So return its builder within the class.. so now no need to remember the builder class.
    static P1_StudentBuilder getBuilder(){
        return new P1_StudentBuilder();
    }
}

// 10:21pm to 10:28pm;